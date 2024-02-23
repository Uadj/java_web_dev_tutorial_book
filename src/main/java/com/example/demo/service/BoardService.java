package com.example.demo.service;

import com.example.demo.dto.BoardDTO;

public interface BoardService {
    Long register(BoardDTO boardDTO);
    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void delete(Long bno);
}
