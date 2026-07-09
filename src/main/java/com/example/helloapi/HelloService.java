package com.example.helloapi;

import org.springframework.stereotype.Service;

/**
 * Service component for greeting logic.
 * Handles the business logic of generating personalized greetings
 * in multiple languages (English, Azerbaijani, Russian).
 */
@Service
public class HelloService {

    /**
     * Generates a personalized greeting message in the specified language.
     * 
     * Supported languages:
     * - "az": Azerbaijani (Salam)
     * - "ru": Russian (Привет)
     * - any other value: English (Hello) - default
     * 
     * @param name The person's name to include in the greeting
     * @param language The language code for the greeting ("en", "az", "ru")
     * @return HelloResponse containing the greeting message
     */
    public HelloResponse greet(String name, String language) {
        String message;

        if ("az".equals(language)) {
            message = "Salam, " + name + "!";
        } else if ("ru".equals(language)) {
            message = "Привет, " + name + "!";
        } else {
            message = "Hello, " + name + "!";
        }

        return new HelloResponse(message);
    }
}