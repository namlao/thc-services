package com.thc.cartservice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(CartNotFoundException.class)
    public ResponseEntity handleException(CartNotFoundException e) {
        Error error = new Error(HttpStatus.NOT_FOUND, e.getLocalizedMessage(), HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<>(error, error.getHttpStatus());
    }

//    @ExceptionHandler(BadRequestException.class)
//    public ResponseEntity<Error> handleMethodArgumentNotValidException(BadRequestException e) {
//        Error errorResponse = new Error(HttpStatus.BAD_REQUEST, e.getLocalizedMessage(), HttpStatus.BAD_REQUEST.value());
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
//    }
//
//    @ResponseStatus(
//            value = HttpStatus.GATEWAY_TIMEOUT,
//            reason = "Upstream Service Not Responding, Try Again")
//    @ExceptionHandler(ServiceUnavailableException.class)
//    public void handleException(ServiceUnavailableException e) {
//    }
}
