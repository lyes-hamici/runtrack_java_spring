package com.example.SpringTest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class HelloController {
    @Value("${greeting.message}")
    private String message;

    @RequestMapping("/helloWord")
    public String helloWord() {
        return "<h1 style='color:blue'>Hello Word</h1>" +
                "try : /randomBackground , /red or getMessage";
    }

    @RequestMapping("/getMessage")
    public String getMessage() {
        return message +
                " ,you can also try : /randomBackground /red , /helloWord or getMessage";
    }

}
