package com.demo.reactiveproducer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

@RestController
public class FluxGreetingController {

    @GetMapping("/flux-greet")
    public Flux<String> greet() {
        List<String> greetings = Arrays.asList("Hello, World!", "Hello, Spring!", "Hello, WebFlux!");
        return Flux.fromIterable(greetings).delayElements(Duration.ofSeconds(1));
    }
}
