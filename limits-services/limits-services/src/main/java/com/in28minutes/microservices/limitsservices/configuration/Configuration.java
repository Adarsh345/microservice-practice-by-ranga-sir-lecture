package com.in28minutes.microservices.limitsservices.configuration;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//Here we learn properties retrivation from properties file.

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties("limit-service")
public class Configuration {
    private int minimum;
    private int maximum;
}
