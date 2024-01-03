package com.cleverpine.plex.controller;

import com.cleverpine.plex.api.MoviesApi;
import com.cleverpine.plex.auth.ViravaSecured;
import com.cleverpine.plex.auth.roles.Resources;
import com.cleverpine.plex.dto.MovieDto;
import com.cleverpine.plex.model.MovieListItem;
import com.cleverpine.plex.model.MoviesListResponse;
import com.cleverpine.plex.service.MovieService;
import com.cleverpine.plex.mapper.MovieMapper;
import com.cleverpine.viravaspringhelper.dto.ScopeType;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.*;

@RestController
@RequiredArgsConstructor
public class MovieController implements MoviesApi {
    private final MovieService movieService;
    private final MovieMapper movieMapper;

    @Override
    @ViravaSecured(resource = Resources.MOVIES, scope = ScopeType.READ)
    public ResponseEntity<String> apiMoviesTestGet() {
        movieService.simpleMovieETL();
//        movieService.getMovieList();
        return ResponseEntity.ok("Movie Test");
    }

    @Override
    public ResponseEntity<MoviesListResponse> apiMoviesGet(Integer page, Integer size) {
        List<MovieDto> movieList = movieService.getMovieList(page, size);

        MoviesListResponse response = new MoviesListResponse();
        movieList.stream()
                .map(movieMapper::movieDtoToMovieListItem)
                .forEach(response::addDataItem);

        return ResponseEntity.ok(response);
    }
}
