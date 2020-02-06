package com.example.exercise.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("german")
public class GreetingServiceGerman implements GreetingsService {
    @Override
    public String sayHello(String name) {
        return "Halo: " + name;
    }
}
