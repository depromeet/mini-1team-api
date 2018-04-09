package com.depromeet.team.mapper;

import com.depromeet.team.domain.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    Integer insert(Member vo);

    Member selectOne(Long uid);

    Integer update(Member vo);

    Integer delete(Long uid);
}
