package com.demo.reactiveproducer;

import com.demo.reactiveproducer.controller.ReactiveGreetingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest(ReactiveGreetingController.class)
public class ReactiveGreetingControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testGreet() {
        webTestClient.get().uri("/reactive-greet?name=John")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("Hello, John!");
    }
}


