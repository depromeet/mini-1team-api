package com.depromeet.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.depromeet.team.domain.CommentVO;
import com.depromeet.team.mapper.CommentMapper;

@Service
public class CommentService {
	@Autowired
	private CommentMapper mapper;

	public void createComment(CommentVO vo) {
		mapper.create(vo);
	}
	
	public CommentVO readComment(long seq) {
		return mapper.read(seq);
	}
	
	public void updateComment(CommentVO vo) {
		mapper.update(vo);
	}
	
	public void deleteComment(long seq) {
		mapper.delete(seq);
	}
	
	public List<CommentVO> listAllComment(long movie_seq) {
		return mapper.listAll(movie_seq);
	}
}
