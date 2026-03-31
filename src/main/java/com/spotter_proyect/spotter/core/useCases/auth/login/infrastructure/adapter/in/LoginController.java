package com.spotter_proyect.spotter.core.useCases.auth.login.infrastructure.adapter.in;

import com.spotter_proyect.spotter.core.useCases.auth.login.application.port.in.LoginUseCase;
import com.spotter_proyect.spotter.core.useCases.auth.login.infrastructure.DTO.LoginResponseDTO;
import com.spotter_proyect.spotter.core.useCases.auth.login.infrastructure.DTO.LoginRequestDTO;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class LoginController {

    private final LoginUseCase login;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@Valid @RequestBody LoginRequestDTO request){
        return ResponseEntity.ok(login.login(request));
    }
}
