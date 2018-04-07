package com.depromeet.team.service;

import com.depromeet.team.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TestService {

    @Autowired
    private TestMapper mapper;

    public LocalDateTime now() {
        return mapper.now();
    }
}
