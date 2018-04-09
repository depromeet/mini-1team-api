package com.depromeet.team.web;

import com.depromeet.team.domain.Comment;
import com.depromeet.team.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService service;

    @PostMapping
    public void create(@RequestBody Comment comment) {
        service.create(comment);
    }

    @GetMapping
    public List<Comment> findAll(@RequestParam("movie_seq") Long movieSeq) {
        return service.findAll(movieSeq);
    }

    @PutMapping
    public void update(@RequestBody Comment comment) {
        service.update(comment);
    }

    @DeleteMapping("{seq}")
    public void delete(@PathVariable("seq") Long seq) {
        service.delete(seq);
    }
}
