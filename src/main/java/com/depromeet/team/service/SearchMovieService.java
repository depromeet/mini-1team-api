package com.depromeet.team.service;

import com.depromeet.team.domain.Movie;
import com.depromeet.team.domain.Search;
import com.depromeet.team.repository.SearchMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SearchMovieService {

    @Autowired
    private SearchMovieRepository repository;

    public Movie findList(Search search) {
        return repository.selectList(search);
    }
}
