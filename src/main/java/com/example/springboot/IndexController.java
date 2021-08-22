package com.example.springboot;


import com.example.simulator.Simulator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() throws IOException, InterruptedException {
        new Simulator().run();
        return "User Boiler Plate Up And Running";
    }
}