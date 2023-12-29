package com.example.demo.resources.Exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.services.Exception.DataBaseException;
import com.example.demo.services.Exception.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
       String error = "Resource not found";
       HttpStatus status = HttpStatus.NOT_FOUND;
       StandardError err = new StandardError(Instant.now(), status.value(),error,request.getRequestURI(),e.getMessage()); 
       return ResponseEntity.status(status).body(err);
    }

     @ExceptionHandler(DataBaseException.class)
    public ResponseEntity<StandardError> database(DataBaseException e, HttpServletRequest request){
       String error = "DataBase error";
       HttpStatus status = HttpStatus.BAD_REQUEST;
       StandardError err = new StandardError(Instant.now(), status.value(),error,request.getRequestURI(),e.getMessage()); 
       return ResponseEntity.status(status).body(err);
    }
    
}
