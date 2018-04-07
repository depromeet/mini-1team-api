package com.depromeet.team.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;

@Mapper
public interface TestMapper {

    LocalDateTime now();
}
