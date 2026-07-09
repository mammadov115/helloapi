package com.example.helloapi;

import lombok.Data;

/**
 * Data Transfer Object (DTO) for incoming greeting requests.
 * Used in POST requests to accept user input.
 * Lombok @Data annotation automatically generates getters, setters, equals, and hashCode methods.
 */
@Data
public class GreetRequest{
    /** The person's name to greet */
    private String name;
    
    /** The language code for the greeting (e.g., "en", "az", "ru") */
    private String language;
}