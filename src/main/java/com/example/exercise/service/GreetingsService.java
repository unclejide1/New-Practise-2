package com.example.exercise.service;

import org.springframework.stereotype.Component;

@Component
public interface GreetingsService {

    String sayHello(String name);
}
