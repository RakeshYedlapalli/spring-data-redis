package com.task.configuration;


import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/product")
public class Controller {

    @AutoConfigureOrder
    RestTemplate restTemplate;

    @GetMapping("/request")
    public void getResponse() {

        //new ResponseEntity<>()
    }
}
