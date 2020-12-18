package edu.seoyun.manage.service;

import edu.seoyun.manage.mapper.BoardMapper;
import edu.seoyun.manage.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper boardMapper;

    public List<Board> getBoardAll() {
        return boardMapper.selectBoardAll();
    }

    public Board getBoard(Long id) {
        return boardMapper.selectBoardById(id);
    }

}
