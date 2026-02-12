package com.spotter_proyect.spotter.core.useCases.auth.login.application.port.persistence;

import com.spotter_proyect.spotter.core.shared.entities.UserEntity;
import com.spotter_proyect.spotter.core.useCases.auth.login.infrastructure.DTO.LoginRequest;

public interface LoginRepositoryPort {
    UserEntity verifyUser(LoginRequest dto);
}
