package com.choongangclass601team4.service;

import java.util.List;

import com.choongangclass601team4.domain.BoardVO;

public interface BoardService {
	
	public void register(BoardVO board);
	
	public BoardVO get(long bno);
	
	public boolean modify(BoardVO board);
	
	public boolean remove(long bno);
	
	public List<BoardVO> getList();

}
