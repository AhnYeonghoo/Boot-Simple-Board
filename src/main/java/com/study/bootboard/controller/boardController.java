package com.study.bootboard.controller;

import com.study.bootboard.entity.Board;
import com.study.bootboard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class boardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write") // localhost:8080/board/write
    public String boardWriteForm() {
        return "board_write";
    }

    @PostMapping("/board/writePro")
    public String boardWritePro(Board board) {
        boardService.write(board);
        return "";
    }
}
