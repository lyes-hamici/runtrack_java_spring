package com.example.SpringTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


@RestController
public class SpringTestController {
    @RequestMapping("/red")
    public String red() {
        return "<h1 style='color:red'>Red</h1>" +
                "try : /randomBackground or /helloWord /getMessage";
    }

    @RequestMapping("/randomBackground")
    public String randomBackground() {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(255);
        int rand_int2 = rand.nextInt(255);
        int rand_int3 = rand.nextInt(255);

        return "<body style='background-color: rgb(" + rand_int1 + "," + rand_int2 + "," + rand_int3 + ");'></body>" +
                "<p style='text-shadow: 0 0 2px #fff;'>try : /red , /helloWord  or refresh the page";
    }
}
