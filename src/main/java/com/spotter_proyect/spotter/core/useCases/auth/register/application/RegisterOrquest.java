package com.spotter_proyect.spotter.core.useCases.auth.register.application;

import com.spotter_proyect.spotter.core.shared.model.User;
import com.spotter_proyect.spotter.core.useCases.auth.register.application.port.in.RegisterUseCase;
import com.spotter_proyect.spotter.core.useCases.auth.register.domain.RegisterService;
import com.spotter_proyect.spotter.core.useCases.auth.register.infrastructure.DTO.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public class RegisterOrquest implements RegisterUseCase {
    private final RegisterService registerService;

    public RegisterOrquest(RegisterService registerService) {
        this.registerService = registerService;
    }

    @Override
    public User register(RegisterRequest requestDTO){
        return registerService.register(requestDTO);
    }
}
