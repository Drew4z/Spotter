package com.spotter_proyect.spotter.core.useCases.client.followTrainer.infrastructure.adapter.in;

import com.spotter_proyect.spotter.core.useCases.client.followTrainer.application.ports.in.FollowUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class FollowController {

    private final FollowUseCase port;

    @PostMapping("/followTrainer/{id}")
    public ResponseEntity<String> followTrainer(@PathVariable Long id){

        return ResponseEntity.ok(port.followTrainer(id));

    }
}
