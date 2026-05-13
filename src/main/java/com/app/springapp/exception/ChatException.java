package com.app.springapp.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@Getter
@NoArgsConstructor
public class ChatException extends RuntimeException {
    private HttpStatus status;

    public ChatException(HttpStatus status,  String message) {
        super(message);
        this.status = status;
    }
}
