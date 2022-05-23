package com.example.graphqlspringboot.api;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestAPI {

    @GetMapping(path = "/")
    public String get(){
        return "test";
    }
}
