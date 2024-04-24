package com.appdeveloperblog.app.ws.exceptions;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class UserControlledException extends RuntimeException {
    public UserControlledException(String message) {
        super(message);
    }
}
