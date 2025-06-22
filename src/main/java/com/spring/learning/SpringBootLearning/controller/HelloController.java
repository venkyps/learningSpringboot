package com.spring.learning.SpringBootLearning.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @GetMapping(value="/hello",produces="application/json")
    public ResponseEntity<String> sayHello() {
        log.debug("Inside helloController test");
        return ResponseEntity.ok("Hello Springboot Version");
    }
}
