package com.spotter_proyect.spotter.core.shared.DTO;

import com.spotter_proyect.spotter.core.shared.enums.VideoCategory;

public record VideoRequest(
        String title,
        String videoUrl,
        VideoCategory category
) {
}
