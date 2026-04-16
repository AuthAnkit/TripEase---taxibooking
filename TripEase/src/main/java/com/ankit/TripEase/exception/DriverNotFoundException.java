package com.ankit.TripEase.exception;

public class DriverNotFoundException extends RuntimeException {
    public DriverNotFoundException(String message)
    {
        super(message);
    }
}
