package com.app_store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class main {
    @GetMapping("/")
    public String mainBrower(){
        return "Welcome to my store";
    }

 
}