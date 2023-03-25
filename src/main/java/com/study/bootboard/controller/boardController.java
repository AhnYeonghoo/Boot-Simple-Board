package com.study.bootboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class boardController {

    @GetMapping("/")
    @ResponseBody
    public String main() {
        return "Hello World";
    }
}
