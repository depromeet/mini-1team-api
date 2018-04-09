package com.depromeet.team.service;

import com.depromeet.team.domain.Member;
import com.depromeet.team.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MemberService {

    @Autowired
    private MemberMapper mapper;

    public Member findOne(Long uid) {
        return mapper.selectOne(uid);
    }

    public void join(Member member) {
        if(exist(member)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "존재하는 사용자입니다.");
        }

        insert(member);
    }

    private boolean exist(Member member) {
        return mapper.selectOne(member.getUid()) != null;
    }

    private void insert(Member member) {
        Integer insertCount = mapper.insert(member);
        if (insertCount.equals(1)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "가입 실패");
        }
    }
}
