package com.demo.reactiveproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ReactiveGreetingController {

    @GetMapping("/reactive-greet")
    public Mono<String> greet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return Mono.just("Hello, " + name + "!");
    }
}

