package com.spotter_proyect.spotter.core.useCases.auth.login.application.port.in;

import com.spotter_proyect.spotter.core.useCases.auth.login.infrastructure.DTO.LoginReponse;
import com.spotter_proyect.spotter.core.useCases.auth.login.infrastructure.DTO.LoginRequest;

public interface LoginUseCase {
    LoginReponse login(LoginRequest request);
}
