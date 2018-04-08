package com.depromeet.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.depromeet.team.domain.CommentVO;

@Mapper
public interface CommentMapper {
	void create(CommentVO vo);
	CommentVO read(long seq);
	void update(CommentVO vo);
	void delete(long seq);
	List<CommentVO> listAll(long movieSeq);	
}
