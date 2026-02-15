package com.spotter_proyect.spotter.core.useCases.trainer.videos.modifyVideos.infrastructure.adapter.in;


import com.spotter_proyect.spotter.core.useCases.trainer.videos.modifyVideos.application.port.in.ModifyVideoUseCase;
import com.spotter_proyect.spotter.core.useCases.trainer.videos.sharedVideos.DTO.VideoRequest;
import com.spotter_proyect.spotter.core.useCases.trainer.videos.sharedVideos.DTO.VideoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/trainer/video")
public class ModifyVideosController {

    private final ModifyVideoUseCase modifyVideoUseCase;

    @PutMapping("/modify/{id}")
    public ResponseEntity<VideoResponse>modifyVideo(@PathVariable Long id, @RequestBody VideoRequest request){

        return ResponseEntity.ok(modifyVideoUseCase.modifyVideo(id, request));
    }
}
