package com.study.bootboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class boardController {

    @GetMapping("/board/write") // localhost:8080/board/write
    public String boardWriteForm() {
        return "board_write";
    }
}
