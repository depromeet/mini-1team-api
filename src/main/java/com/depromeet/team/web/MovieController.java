package com.depromeet.team.web;

import com.depromeet.team.domain.Movie;
import com.depromeet.team.domain.Search;
import com.depromeet.team.service.SearchMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private SearchMovieService service;

    @GetMapping
    public Movie findList(@RequestParam String query, @RequestParam(defaultValue = "") String genre, @RequestParam(defaultValue = "1") Integer start) {
        Search search = new Search(query, genre, start);
        return service.findList(search);
    }
}
