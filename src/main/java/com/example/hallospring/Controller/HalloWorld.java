package com.example.hallospring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class HalloWorld {
    @GetMapping("/helloWorldSpring1")
    public String helloworld1(){
        return "Hallo Spring1";
    }
    @GetMapping("/helloWorldSpring2")
    public String helloworld2(){
        return "Hallo Spring2";
    }
}
