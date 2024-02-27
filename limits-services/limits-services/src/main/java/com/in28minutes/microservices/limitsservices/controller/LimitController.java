package com.in28minutes.microservices.limitsservices.controller;

import com.in28minutes.microservices.limitsservices.bean.Limit;
import com.in28minutes.microservices.limitsservices.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limit")
    public Limit getLimit(){
        return new Limit(configuration.getMinimum(), configuration.getMaximum());
    }
}
