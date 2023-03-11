package com.example.demo11.exceptions;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResourceNotFoundException extends RuntimeException{

    protected String message;

    public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
