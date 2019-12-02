package com.zking.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        System.out.println("hello"+System.currentTimeMillis());
        return "index";
    }
}
