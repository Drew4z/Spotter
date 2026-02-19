package com.spotter_proyect.spotter.core.useCases.client.getFeed.domain;

import com.spotter_proyect.spotter.core.shared.DTO.VideoResponse;
import com.spotter_proyect.spotter.core.useCases.client.getFeed.application.port.persistence.GetFeedRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetFeedService {

    private final GetFeedRepositoryPort repositoryPort;

    public List<VideoResponse> getFeed(){
        return repositoryPort.getRandomFeed();
    }
}
