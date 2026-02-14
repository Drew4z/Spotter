package com.spotter_proyect.spotter.core.useCases.trainer.videos.getVideosById.application.port.in;

import com.spotter_proyect.spotter.core.useCases.trainer.videos.sharedVideos.DTO.VideoResponse;

import java.util.List;

public interface GetVideosUseCase {
    List<VideoResponse> getVideos(Long id);
}
