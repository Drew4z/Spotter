package com.spotter_proyect.spotter.core.useCases.trainer.videos.modifyVideos.application.port.in;

import com.spotter_proyect.spotter.core.useCases.trainer.videos.sharedVideos.DTO.VideoRequest;
import com.spotter_proyect.spotter.core.useCases.trainer.videos.sharedVideos.DTO.VideoResponse;

import java.util.List;

public interface ModifyVideoUseCase {
    VideoResponse modifyVideo(Long id, VideoRequest request);
}
