package com.example.hallospring.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API")
public class HalloWorld {
    @GetMapping("/helloWorldSpring1")
    public String helloworld1() {
        return "Hallo Spring1";
    }

    @GetMapping("/helloWorldSpring2")
    public String helloworld2() {
        return "Hallo Spring2";
    }

    @GetMapping("/greating/{name}/{name2}")
    public String greeting(@PathVariable String name, @PathVariable String name2) {
        return "Hallo" + name + "and" + name2;

    }
    @GetMapping("/request")
    public String greeting(@RequestParam String name) {
        return "Hallo" + name ;

    }

    @GetMapping("/post")
    public String post(@RequestBody String text) {
        return "Body" + text.length();

    }

    /*
    @GetMapping("/put")
    public void put(@RequestBody product product) {
    }
    */
}