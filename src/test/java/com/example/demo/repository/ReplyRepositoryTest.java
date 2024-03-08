package com.example.demo.repository;

import com.example.demo.domain.Board;
import com.example.demo.domain.Reply;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class ReplyRepositoryTest {
    @Autowired
    private ReplyRepository replyRepository;

    @Test
    public void testInsert(){

        Long bno = 100L;

        Board board = Board.builder().bno(bno).build();

        Reply reply = Reply.builder()
                        .board(board)
                        .replyText("댓글")
                        .commenter("commenter1")
                        .build();

        replyRepository.save(reply);
    }
}