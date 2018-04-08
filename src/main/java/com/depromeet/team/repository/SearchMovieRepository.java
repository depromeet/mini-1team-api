package com.depromeet.team.repository;

import com.depromeet.team.config.NaverSearchMovieProperties;
import com.depromeet.team.domain.Movie;
import com.depromeet.team.domain.Search;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class SearchMovieRepository {

    private final RestTemplate restTemplate;
    private final NaverSearchMovieProperties properties;

    private static final String X_NAVER_CLIENT_ID_KEY = "X-Naver-Client-Id";
    private static final String X_NAVER_CLIENT_SECRET_KEY = "X-Naver-Client-Secret";

    public SearchMovieRepository(RestTemplateBuilder builder, NaverSearchMovieProperties properties) {
        this.restTemplate = builder.build();
        this.properties = properties;
    }

    public Movie selectList(Search search) {
        try {
            return restTemplate.exchange(uriComponentsBuilder(search).toUriString(),
                                        HttpMethod.GET,
                                        new HttpEntity<>(httpHeaders()),
                                        Movie.class).getBody();
        } catch (RestClientResponseException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "ERROR");
        }
    }

    private UriComponentsBuilder uriComponentsBuilder(Search search) {
        return UriComponentsBuilder
                .fromHttpUrl("https://openapi.naver.com/v1/search/movie.json")
                .queryParams(search.toParams());
    }

    private HttpHeaders httpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(X_NAVER_CLIENT_ID_KEY, properties.getClientId());
        headers.add(X_NAVER_CLIENT_SECRET_KEY, properties.getClientSecret());
        return headers;
    }
}
