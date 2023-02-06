package com.example.hallospring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class HalloWorld {
    @GetMapping("/helloWorldSpring")
    public String helloworld(){
        return "Hallo Spring";
    }
}