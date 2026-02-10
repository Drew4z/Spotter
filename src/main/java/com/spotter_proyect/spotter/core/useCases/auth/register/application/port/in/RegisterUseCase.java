package com.spotter_proyect.spotter.core.useCases.auth.register.application.port.in;

import com.spotter_proyect.spotter.core.shared.model.User;
import com.spotter_proyect.spotter.core.useCases.auth.register.infrastructure.DTO.RegisterRequestDTO;

public interface RegisterUseCase {

    User register(RegisterRequestDTO requestDTO);
}
