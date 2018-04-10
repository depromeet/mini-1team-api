package com.depromeet.team.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;

public class Movie {

    @JsonIgnore
    private Date lastBuildDate;
    private Integer total;
    private Integer start;
    private Integer display;
    private List<MovieItem> items;

    protected Movie() {}

    public Movie(Date lastBuildDate, Integer total, Integer start, Integer display, List<MovieItem> items) {
        this.lastBuildDate = lastBuildDate;
        this.total = total;
        this.start = start;
        this.display = display;
        this.items = items;
    }

    public Date getLastBuildDate() {
        return lastBuildDate;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getStart() {
        return start;
    }

    public Integer getDisplay() {
        return display;
    }

    public List<MovieItem> getItems() {
        return items;
    }
}
