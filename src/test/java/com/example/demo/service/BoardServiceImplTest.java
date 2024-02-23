package com.example.demo.service;

import com.example.demo.domain.Board;
import com.example.demo.dto.BoardDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class BoardServiceImplTest {

    @Autowired
    private BoardService boardService;
    @Test
    void testRegister() {

        log.info(boardService.getClass().getName());

        BoardDTO boardDTO = BoardDTO.builder()
                .title("Sample title")
                .content("Sample content")
                .writer("user00")
                .build();
        Long bno = boardService.register(boardDTO);

        log.info("bno: " + bno);
    }
    @Test
    void modify() {

        BoardDTO boardDTO = BoardDTO.builder()
                .bno(101L)
                .title("Updated..101")
                .content("Updated content 101")
                .build();

        boardService.modify(boardDTO);
    }
}