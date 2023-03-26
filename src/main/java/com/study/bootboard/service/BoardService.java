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

    // 게시글 작성
    public void write(Board board) {
        boardRepository.save(board);
    }

    //게시글 리스트 처리
    public List<Board> boardList() {
        return boardRepository.findAll();
    }

    // 상세 페이지 작성

    public Board boardView(Integer id) {
        return boardRepository.findById(id).get();
    }
}
