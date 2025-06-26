package org.scoula.board.mapper;

import org.apache.ibatis.annotations.Select;
import org.scoula.board.domain.BoardVO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BoardMapper {

    public List<BoardVO> getList();
    public BoardVO get(Long no);
    public void create(BoardVO board);
    public int update(BoardVO board);
    public int delete(Long no);

}
