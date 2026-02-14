package com.spotter_proyect.spotter.core.useCases.trainer.videos.modifyVideos.application.port.persistence;

import com.spotter_proyect.spotter.core.shared.entities.VideoEntity;
import com.spotter_proyect.spotter.core.useCases.trainer.videos.sharedVideos.DTO.VideoResponse;

import java.util.List;

public interface ModifyVideoRepositoryPort {
    VideoResponse modifyVideo(VideoEntity videoEntity);
}
