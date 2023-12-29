package com.example.demo.services.Exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id){
        super("Resource not foun"+ id);
    }
}
