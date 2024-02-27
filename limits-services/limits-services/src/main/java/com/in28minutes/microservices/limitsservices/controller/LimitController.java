package com.in28minutes.microservices.limitsservices.controller;

import com.in28minutes.microservices.limitsservices.bean.Limit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @GetMapping("/limit")
    public Limit getLimit(){
        return new Limit(1, 1000);
    }
}
