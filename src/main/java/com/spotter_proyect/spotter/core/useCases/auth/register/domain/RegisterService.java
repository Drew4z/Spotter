package com.spotter_proyect.spotter.core.useCases.auth.register.domain;

import com.spotter_proyect.spotter.core.shared.mapper.Mapper;
import com.spotter_proyect.spotter.core.shared.model.Client;
import com.spotter_proyect.spotter.core.shared.model.Trainer;
import com.spotter_proyect.spotter.core.shared.model.User;
import com.spotter_proyect.spotter.core.useCases.auth.register.application.port.persistence.RegisterRepositoryPort;
import com.spotter_proyect.spotter.core.useCases.auth.register.infrastructure.DTO.RegisterRequestDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RegisterService {
    private final RegisterRepositoryPort repositoryPort;
    private final Mapper mapper;

    public RegisterService(RegisterRepositoryPort repositoryPort, Mapper mapper) {
        this.repositoryPort = repositoryPort;
        this.mapper = mapper;
    }

    public User register(RegisterRequestDTO request) {

        User userToSave = mapper.registerReqToDomain(request);

        // 2. Guardamos (el puerto se encarga de traducir a Entity)
        return repositoryPort.save(userToSave);
    }
}
