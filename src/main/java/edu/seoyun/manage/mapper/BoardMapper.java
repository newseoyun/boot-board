package edu.seoyun.manage.mapper;

import edu.seoyun.manage.domain.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> selectBoardAll();
    Board selectBoardById(Long id);
}
