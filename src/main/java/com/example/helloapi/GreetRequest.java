package com.example.helloapi;

import lombok.Data;

@Data
public class GreetRequest{
    private String name;
    private String language;
}