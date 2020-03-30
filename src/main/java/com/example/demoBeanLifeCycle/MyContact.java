package com.example.demoBeanLifeCycle;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "contact")
@ToString
public class MyContact {
    private String name;
    private int age;
    private Address address;
}
