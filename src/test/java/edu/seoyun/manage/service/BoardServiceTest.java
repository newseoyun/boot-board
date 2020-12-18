package edu.seoyun.manage.service;

import edu.seoyun.manage.domain.Board;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Test
    void getBoardAll() {
        List<Board> boardAll = boardService.getBoardAll();
        log.info("boardAll: {}", boardAll);

    }

    @Test
    void getBoard() {
        Board board = boardService.getBoard(1L);
        log.info("board : {}", board);
    }
}