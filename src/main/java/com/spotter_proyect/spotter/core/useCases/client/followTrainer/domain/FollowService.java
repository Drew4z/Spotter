package com.spotter_proyect.spotter.core.useCases.client.followTrainer.domain;

import com.spotter_proyect.spotter.core.exceptions.errors.DuplicateActionException;
import com.spotter_proyect.spotter.core.exceptions.errors.ResourceNotFoundException;
import com.spotter_proyect.spotter.core.shared.entities.ClientEntity;
import com.spotter_proyect.spotter.core.shared.entities.TrainerEntity;
import com.spotter_proyect.spotter.core.shared.repositories.ClientRepository;
import com.spotter_proyect.spotter.core.shared.repositories.FollowRepository;
import com.spotter_proyect.spotter.core.shared.repositories.TrainerRepository;
import com.spotter_proyect.spotter.core.shared.repositories.UserRepository;
import com.spotter_proyect.spotter.core.useCases.client.followTrainer.application.ports.persistence.FollowRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FollowService {

    private final FollowRepositoryPort repositoryPort;
    private final UserRepository userRepository;
    private final FollowRepository followRepository;
    private final ClientRepository clientRepository;
    private final TrainerRepository trainerRepository;

    public String followTrainer(Long trainerId){
        // 1. Conseguir el id del cliente y verificar que existe
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String emailUser = auth.getName();

        // 2. Verificar que el entrenador existe
       ClientEntity clientEntity = clientRepository.findByEmail(emailUser)
                .orElseThrow(()-> new ResourceNotFoundException("No se ha encontrado al cliente"));

       TrainerEntity trainerEntity = trainerRepository.findById(trainerId)
                .orElseThrow(()-> new ResourceNotFoundException("No se ha encontrado al entrenador"));

        // 3. Le preguntas a la base de datos: "¿Este cliente YA sigue a este entrenador?"
        boolean alreadyFollow = followRepository.existsByClientEntityAndTrainerEntity(clientEntity, trainerEntity);

        // 4. Verificamos que no le siga
        if (alreadyFollow) {
            // Detonas el error. El código se detiene AQUÍ MISMO y salta directo a tu GlobalExceptionHandler
            throw new DuplicateActionException("Ya estás siguiendo a este entrenador.");
        }

        return repositoryPort.followTrainer(clientEntity, trainerEntity);
    }
}