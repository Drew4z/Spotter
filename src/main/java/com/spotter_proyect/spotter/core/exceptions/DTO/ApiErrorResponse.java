
package com.spotter_proyect.spotter.core.exceptions.DTO;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;


@Data
@RequiredArgsConstructor
public class ApiErrorResponse {
    private String message;
    private int status;
    private LocalDateTime timestamp;

    public ApiErrorResponse(String message, int status) {
        this.message = message;
        this.status = status;
    }
}



