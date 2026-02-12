package com.spotter_proyect.spotter.core.useCases.auth.register.domain;

import com.spotter_proyect.spotter.core.shared.mapper.Mapper;
import com.spotter_proyect.spotter.core.shared.model.User;
import com.spotter_proyect.spotter.core.useCases.auth.register.application.port.persistence.RegisterRepositoryPort;
import com.spotter_proyect.spotter.core.useCases.auth.register.infrastructure.DTO.RegisterRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    private final RegisterRepositoryPort repositoryPort;
    private final Mapper mapper;
    private final PasswordEncoder passwordEncoder;

    public RegisterService(RegisterRepositoryPort repositoryPort, Mapper mapper, PasswordEncoder passwordEncoder) {
        this.repositoryPort = repositoryPort;
        this.mapper = mapper;
        this.passwordEncoder = passwordEncoder;
    }

    public User register(RegisterRequest request) {
        // 1. Encriptamos la contraseña antes de crear el dominio
        RegisterRequest securedRequest = new RegisterRequest(
                request.email(),
                passwordEncoder.encode(request.password()),
                request.name(),
                request.role(),
                request.specialty(),
                request.goals()
        );

        User userToSave = mapper.registerReqToDomain(securedRequest);

        // 2. Guardamos (el puerto se encarga de traducir a Entity)
        return repositoryPort.save(userToSave);
    }
}
