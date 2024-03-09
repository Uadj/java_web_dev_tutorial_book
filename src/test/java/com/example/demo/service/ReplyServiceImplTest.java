package com.example.demo.service;

import com.example.demo.dto.ReplyDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Log4j2
class ReplyServiceImplTest {
    @Autowired
    private ReplyService replyService;

    @Test
    public void testRegister(){

        ReplyDTO replyDTO = ReplyDTO.builder()
                .replyText("ReplyDTO TEST")
                .commenter("commenter")
                .bno(100L)
                .build();

        log.info(replyService.register(replyDTO));
    }
}