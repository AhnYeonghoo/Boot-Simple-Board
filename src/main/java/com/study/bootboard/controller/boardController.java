package com.study.bootboard.controller;

import com.study.bootboard.entity.Board;
import com.study.bootboard.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    // 게시물 작성 페이지 맵핑
    @PostMapping("/board/writePro")
    public String boardWritePro(Board board) {
        boardService.write(board);
        return "";
    }

    // 게시물 리스트 페이지 맵핑
    @GetMapping("board/list")
    public String boardList(Model model) {
        model.addAttribute("list", boardService.boardList());
        return "board_list";
    }

    // 웰컴 페이지 맵핑
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("list", boardService.boardList());
        return "board_list";
    }

    // 상세 페이지 맵핑
    @GetMapping("board/view")
    public String boardView(Model model, Integer id) {
        model.addAttribute("article", boardService.boardView(id));
        return "board_view";
    }

    // 게시글 삭제 페이지 맵핑
    @GetMapping("board/delete")
    public String boardDelete(Integer id) {
        boardService.boardDelete(id);
        return "redirect:/board/list";
    }
}
