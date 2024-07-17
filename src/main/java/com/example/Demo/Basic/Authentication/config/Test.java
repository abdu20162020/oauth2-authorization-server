package com.example.Demo.Basic.Authentication.config;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    //get request return any string
    @GetMapping("/private")
    @PreAuthorize("#oauth2.hasScope('read')")
    public String get() {
        return "Hello World";
    }
}
