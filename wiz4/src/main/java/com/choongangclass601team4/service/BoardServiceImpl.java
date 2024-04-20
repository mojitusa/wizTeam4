package com.choongangclass601team4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.choongangclass601team4.domain.BoardVO;
import com.choongangclass601team4.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	//spring 4.3 이상에서 자동 처리
	private BoardMapper mapper;

	@Override
	public void register(BoardVO board) {

		log.info("register......." + board);
		
		mapper.insertSelectKey(board);
		
	}

	@Override
	public BoardVO get(long bno) {
		
		log.info("get......." + bno);
		
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {

		log.info("modify......." + board);
		
		return mapper.update(board) == 1;
	}

	@Override
	public boolean remove(long bno) {

		log.info("remove......." + bno);
		
		return mapper.delete(bno) == 1;
	}

	@Override
	public List<BoardVO> getList() {
		
		log.info("getList.......");
		
		return mapper.getList();
	}

}
