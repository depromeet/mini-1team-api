package com.depromeet.team.web;

import com.depromeet.team.domain.Member;
import com.depromeet.team.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("member")
public class MemberController {

    @Autowired
    private MemberService service;

    @PostMapping
    public void join(@RequestBody Member member) {
        service.join(member);
    }

    @GetMapping("{uid}")
    public Member findOne(@PathVariable Long uid) {
        return service.findOne(uid);
    }
}
