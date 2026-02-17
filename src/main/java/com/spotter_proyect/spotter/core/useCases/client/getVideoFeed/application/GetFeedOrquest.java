package com.spotter_proyect.spotter.core.useCases.client.getVideoFeed.application;

import com.spotter_proyect.spotter.core.shared.DTO.VideoResponse;
import com.spotter_proyect.spotter.core.useCases.client.getVideoFeed.application.port.in.GetFeedUseCase;
import com.spotter_proyect.spotter.core.useCases.client.getVideoFeed.domain.GetFeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetFeedOrquest implements GetFeedUseCase {

    private final GetFeedService service;

    @Override
    public List<VideoResponse> getFeed() {
        return service.getFeed();
    }
}
