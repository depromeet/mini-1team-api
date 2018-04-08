package com.depromeet.team.domain;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

public class Search {

    private String query;
    private String genre;
    private Integer start;

    public Search(String query, String genre, Integer start) {
        this.query = query;
        this.genre = genre;
        this.start = start;
    }

    public String getQuery() {
        return query;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getStart() {
        return start;
    }

    public MultiValueMap<String, String> toParams() {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("query", this.query);
        params.add("genre", this.genre);
        params.add("start", String.valueOf(this.start));
        return params;
    }
}
