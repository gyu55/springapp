package com.app.springapp.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@NoArgsConstructor
public class PostException extends RuntimeException {
    private HttpStatus status;

    public PostException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }
}
