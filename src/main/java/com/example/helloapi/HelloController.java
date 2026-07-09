package com.example.helloapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public HelloResponse hello(@RequestParam(defaultValue = "World") String name) {
        return helloService.greet(name, "en");
    }

    @GetMapping("/{name}")
    public HelloResponse helloPath(@PathVariable String name) {
        return helloService.greet(name, "en");
    }

    @PostMapping
    public HelloResponse helloPost(@RequestBody GreetRequest request) {
        return helloService.greet(request.getName(), request.getLanguage());
    }
}