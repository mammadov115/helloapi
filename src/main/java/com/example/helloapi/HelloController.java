package com.example.helloapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello(@RequestParam(name = "name", defaultValue = "World") String name) {
        return new HelloResponse("Hello, " + name + "!");
    }

}
