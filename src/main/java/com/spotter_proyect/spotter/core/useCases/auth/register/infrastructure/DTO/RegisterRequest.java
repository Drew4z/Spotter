package com.spotter_proyect.spotter.core.useCases.auth.register.infrastructure.DTO;

public record RegisterRequest(
        String email,
        String password,
        String name,
        String role,
        String specialty,
        String goals
) {
}
