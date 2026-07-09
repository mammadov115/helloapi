package com.example.helloapi;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

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