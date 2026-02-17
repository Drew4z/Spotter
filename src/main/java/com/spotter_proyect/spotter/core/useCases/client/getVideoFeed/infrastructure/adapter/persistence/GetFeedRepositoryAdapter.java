package com.spotter_proyect.spotter.core.useCases.client.getVideoFeed.infrastructure.adapter.persistence;

import com.spotter_proyect.spotter.core.shared.DTO.VideoResponse;
import com.spotter_proyect.spotter.core.shared.entities.VideoEntity;
import com.spotter_proyect.spotter.core.shared.mapper.Mapper;
import com.spotter_proyect.spotter.core.shared.repositories.VideoRepository;
import com.spotter_proyect.spotter.core.useCases.client.getVideoFeed.application.port.persistence.GetFeedRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetFeedRepositoryAdapter implements GetFeedRepositoryPort {

    private final VideoRepository videoRepository;
    private final Mapper mapper;

    @Override
    public List<VideoResponse> getRandomFeed(){

        List<VideoEntity> list = videoRepository.findAllRandom();
        return mapper.listVideosEntityToReponse(list);

    }
}
