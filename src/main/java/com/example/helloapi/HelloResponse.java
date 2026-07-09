package com.example.helloapi;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Data Transfer Object (DTO) for greeting responses.
 * Used in API responses to return the greeting message to the client.
 * Lombok annotations generate getter and constructor methods.
 */
@Getter
@AllArgsConstructor
public class HelloResponse {
    /** The personalized greeting message in the requested language */
    private String message;
}
