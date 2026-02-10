package com.spotter_proyect.spotter.core.shared.model;

import java.time.LocalDateTime;

// Fíjate: No hay imports de Jakarta/JPA. ¡Es puro!
public record Trainer(
        Long id,
        String name,
        String email,
        String password,
        String role,
        Boolean isPremium,
        LocalDateTime createdAt,
        // Campos específicos de Trainer
        String specialty,
        String biography,
        String phoneNumber,
        Boolean isVerified
) implements User{}