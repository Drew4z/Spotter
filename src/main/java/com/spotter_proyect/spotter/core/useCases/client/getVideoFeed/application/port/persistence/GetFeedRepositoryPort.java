package com.spotter_proyect.spotter.core.useCases.client.getVideoFeed.application.port.persistence;

import com.spotter_proyect.spotter.core.shared.DTO.VideoResponse;

import java.util.List;

public interface GetFeedRepositoryPort {
    List<VideoResponse> getRandomFeed();
}
