package com.example.helloapi;

import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for greeting endpoints.
 * Handles HTTP requests for hello/greeting functionality.
 * All endpoints are mapped under /hello base path.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    private final HelloService helloService;

    /**
     * Constructor for dependency injection.
     * Spring automatically injects the HelloService bean.
     * 
     * @param helloService The service that handles greeting logic
     */
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    /**
     * GET endpoint that accepts name as query parameter.
     * Example: GET /hello?name=John
     * 
     * @param name The person's name (defaults to "World" if not provided)
     * @return HelloResponse containing the greeting message in English
     */
    @GetMapping
    public HelloResponse hello(@RequestParam(defaultValue = "World") String name) {
        return helloService.greet(name, "en");
    }

    /**
     * GET endpoint that accepts name as path parameter.
     * Example: GET /hello/John
     * 
     * @param name The person's name extracted from the URL path
     * @return HelloResponse containing the greeting message in English
     */
    @GetMapping("/{name}")
    public HelloResponse helloPath(@PathVariable String name) {
        return helloService.greet(name, "en");
    }

    /**
     * POST endpoint that accepts name and language in request body.
     * Supports multiple languages: "en" (English), "az" (Azerbaijani), "ru" (Russian)
     * Example: POST /hello with body {"name": "John", "language": "en"}
     * 
     * @param request The GreetRequest containing name and language preference
     * @return HelloResponse containing the greeting message in the specified language
     */
    @PostMapping
    public HelloResponse helloPost(@RequestBody GreetRequest request) {
        return helloService.greet(request.getName(), request.getLanguage());
    }
}