package com.example.pierwszaaplikacja;

import org.springframework.web.bind.annotation.GetMapping;

public class klasa {
    @GetMapping (path ="api/hello")
    public String hello() {
        return "hello world from the server";
    }
}
