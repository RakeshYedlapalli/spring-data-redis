package com.javatechie.redis;

import com.task.RestTemplateRequestInterceptors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/product")
public class SpringDataRedisExampleApplication {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/submitForm")
    public ResponseEntity<String> remove(@RequestParam("fname") String fname) {

        HttpEntity requestEntity
                = new HttpEntity<>("loginForm");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //headers.add();
       restTemplate.getForEntity("http://localhost:9294/product/receive",Void.class);
       return null;

    }


    @GetMapping("/receive")
    public void receive(@RequestHeader HttpHeaders headers) {

        System.out.println(headers.entrySet());




    }


    public static void main(String[] args) {
        SpringApplication.run(SpringDataRedisExampleApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate (){

        RestTemplate restTemplate = new RestTemplate();
        List<ClientHttpRequestInterceptor> interceptors
                = restTemplate.getInterceptors();
        if (CollectionUtils.isEmpty(interceptors)) {
            interceptors = new ArrayList<>();
        }
        interceptors.add(new RestTemplateRequestInterceptors());
        restTemplate.setInterceptors(interceptors);
        return restTemplate;

    }



}
