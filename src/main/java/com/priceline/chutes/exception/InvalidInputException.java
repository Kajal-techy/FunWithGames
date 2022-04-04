package com.priceline.chutes.exception;

public class InvalidInputException extends Exception {
    private String errorMessage;

    public InvalidInputException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}
