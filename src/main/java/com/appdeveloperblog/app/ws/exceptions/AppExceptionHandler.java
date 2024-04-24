package com.appdeveloperblog.app.ws.exceptions;

import com.appdeveloperblog.app.ws.ui.model.response.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleAnyException(Exception ex , WebRequest request){

        String errorDescription = ex.getLocalizedMessage();
        if(errorDescription == null) errorDescription = ex.toString();
        ErrorMessage message = new ErrorMessage(new Date() , errorDescription);
        return new ResponseEntity<>(message, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(value = {NullPointerException.class})
    public ResponseEntity<Object> handleNullPointerException(NullPointerException ex , WebRequest request){

        String errorDescription = ex.getLocalizedMessage();
        if(errorDescription == null) errorDescription = ex.toString();
        ErrorMessage message = new ErrorMessage(new Date() , errorDescription);
        return new ResponseEntity<>(message, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
