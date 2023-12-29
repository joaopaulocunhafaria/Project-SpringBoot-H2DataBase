package com.example.demo.resources.Exception;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {

    private static final Long serialVersionUID = 1L;

    private Instant timeStamp;
    private Integer status;
    private String error;
    private String path;
    private String message;

    public StandardError() {
    }

    public StandardError(Instant timeStamp, Integer status, String error, String path, String message) {
        this.timeStamp = timeStamp;
        this.status = status;
        this.error = error;
        this.path = path;
        this.message = message;
    }

    public static Long getSerialversionuid() {
        return serialVersionUID;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    

}
