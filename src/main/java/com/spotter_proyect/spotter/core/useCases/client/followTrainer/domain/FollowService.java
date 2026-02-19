package com.spotter_proyect.spotter.core.useCases.client.followTrainer.domain;

import com.spotter_proyect.spotter.core.shared.entities.UserEntity;
import com.spotter_proyect.spotter.core.shared.repositories.UserRepository;
import com.spotter_proyect.spotter.core.useCases.client.followTrainer.application.ports.persistence.FollowRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FollowService {

    private final FollowRepositoryPort repositoryPort;
    private final UserRepository userRepository;


    public String followTrainer(Long id){
        UserEntity trainer = userRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("TRAINER NO ENCONTRADO !!!"));

        // 2. SEGURIDAD: Verificar que el usuario actual es el dueño del video
        String email = SecurityContextHolder.getContext().getAuthentication().getName();

        if (!trainer.getEmail().equals(email)) {
            throw new RuntimeException("No tienes permiso para editar este video ⛔");
        }


    }


}

