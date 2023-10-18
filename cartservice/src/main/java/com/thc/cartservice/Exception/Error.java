package com.thc.cartservice.Exception;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@RequiredArgsConstructor
public class Error {
    private final HttpStatus httpStatus;
    private final String message;
    private final int code;
}