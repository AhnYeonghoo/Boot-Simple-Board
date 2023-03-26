package com.study.bootboard.service;

import com.study.bootboard.entity.Board;
import com.study.bootboard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public void write(Board board) {
        boardRepository.save(board);
    }

    public List<Board> boardList() {
        return boardRepository.findAll();
    }
}
