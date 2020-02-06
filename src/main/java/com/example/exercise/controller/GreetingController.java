package com.example.exercise.controller;

import com.example.exercise.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class GreetingController {

    @Autowired
    private GreetingsService greetingsService;

    @RequestMapping(value = "hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable(value = "name") String name){
       return greetingsService.sayHello(name);
    }
}
