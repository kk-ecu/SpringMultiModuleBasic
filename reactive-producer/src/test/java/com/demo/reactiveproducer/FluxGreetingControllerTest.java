package com.demo.reactiveproducer;

import com.demo.reactiveproducer.controller.FluxGreetingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

@WebFluxTest(FluxGreetingController.class)
public class FluxGreetingControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testGreet() {
        Flux<String> expectedGreetings = Flux.just("Hello, World!", "Hello, Spring!", "Hello, WebFlux!");

        webTestClient.get().uri("/flux-greet")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(String.class)
                .contains("Hello, World!", "Hello, Spring!", "Hello, WebFlux!");
    }
}
