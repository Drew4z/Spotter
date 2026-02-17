package com.spotter_proyect.spotter.core.shared.DTO;

import java.time.LocalDateTime;

public record UserResponse(
        Long id,
        String name,
        String email,
        String role,
        LocalDateTime createAt
) {
}
