package com.spotter_proyect.spotter.core.useCases.auth.login.infrastructure.DTO;

public record LoginRequest(
        String email,
        String password
) {}
