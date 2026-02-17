package com.spotter_proyect.spotter.core.useCases.trainer.videos.modifyVideos.infrastructure.adapter.in;


import com.spotter_proyect.spotter.core.useCases.trainer.videos.modifyVideos.application.port.in.ModifyVideoUseCase;
import com.spotter_proyect.spotter.core.shared.DTO.VideoRequest;
import com.spotter_proyect.spotter.core.shared.DTO.VideoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
