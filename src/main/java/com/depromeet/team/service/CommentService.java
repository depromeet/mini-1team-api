package com.depromeet.team.service;

import java.util.List;

import com.depromeet.team.domain.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.depromeet.team.mapper.CommentMapper;

@Service
public class CommentService {

	@Autowired
	private CommentMapper mapper;

	public void create(Comment vo) {
		mapper.insert(vo);
	}
	
	public Comment findOne(long seq) {
		return mapper.selectOne(seq);
	}
	
	public void update(Comment vo) {
		mapper.update(vo);
	}
	
	public void delete(long seq) {
		mapper.delete(seq);
	}
	
	public List<Comment> findAll(long movie_seq) {
		return mapper.selectAll(movie_seq);
	}
}
