package com.app_store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppStoreController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}