package com.example.exercise.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class GreetingServiceEnglish implements GreetingsService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
