package com.depromeet.team.mapper;

import com.depromeet.team.domain.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    void insert(Comment comment);

    Comment selectOne(Long seq);

    void update(Comment vo);

    void delete(Long seq);

    List<Comment> selectAll(Long movieSeq);
}
