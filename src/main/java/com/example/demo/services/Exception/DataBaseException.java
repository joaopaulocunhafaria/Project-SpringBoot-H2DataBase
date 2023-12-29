package com.example.demo.services.Exception;

public class DataBaseException extends RuntimeException {

    private static final Long serialVersionUID = 1L;

    public DataBaseException(String error) {
        super(error);
    }

}
