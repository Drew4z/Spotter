package com.spotter_proyect.spotter.core.useCases.trainer.videos.modifyVideos.application;

import com.spotter_proyect.spotter.core.useCases.trainer.videos.modifyVideos.application.port.in.ModifyVideoUseCase;
import com.spotter_proyect.spotter.core.useCases.trainer.videos.modifyVideos.domain.ModifyVideoService;
import com.spotter_proyect.spotter.core.useCases.trainer.videos.sharedVideos.DTO.VideoRequest;
import com.spotter_proyect.spotter.core.useCases.trainer.videos.sharedVideos.DTO.VideoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModifyVideoOrquet implements ModifyVideoUseCase {

    private final ModifyVideoService service;

    @Override
    public VideoResponse modifyVideo(Long id, VideoRequest request){
        return service.modifyVideo(id, request);
    }
}
