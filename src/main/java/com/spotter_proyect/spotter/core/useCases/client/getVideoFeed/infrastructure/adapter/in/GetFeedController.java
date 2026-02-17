package com.spotter_proyect.spotter.core.useCases.client.getVideoFeed.infrastructure.adapter.in;

import com.spotter_proyect.spotter.core.useCases.client.getVideoFeed.application.port.in.GetFeedUseCase;
import com.spotter_proyect.spotter.core.shared.DTO.VideoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client/video")
public class GetFeedController {

    private final GetFeedUseCase useCase;

    @GetMapping("/getFeed")
    public ResponseEntity<List<VideoResponse>> getFeed() {

        return ResponseEntity.ok(useCase.getFeed());
    }
}
