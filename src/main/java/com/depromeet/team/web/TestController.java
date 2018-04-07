package com.depromeet.team.web;

import com.depromeet.team.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TestController {

    @Autowired
    private TestService service;

    @GetMapping
    public LocalDateTime now() {
        return service.now();
    }
}
