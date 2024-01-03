package com.cleverpine.plex.controller;

import com.cleverpine.plex.api.MoviesApi;
import com.cleverpine.plex.auth.ViravaSecured;
import com.cleverpine.plex.auth.roles.Resources;
import com.cleverpine.plex.entity.future.*;
import com.cleverpine.plex.projection.MovieProjection;
import com.cleverpine.plex.repository.future.*;
import com.cleverpine.plex.repository.legacy.MetadataItemsRepository;
import com.cleverpine.viravaspringhelper.dto.ScopeType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequiredArgsConstructor
public class MovieController implements MoviesApi {


    final private MetadataItemsRepository metadataItemsRepository;
    final private MoviesRepository moviesRepository;



    @Override
    @ViravaSecured(resource = Resources.MOVIES, scope = ScopeType.READ)
    public ResponseEntity<String> apiMoviesTestGet() {
        List<Movies> moviesList = new ArrayList<>();
        MovieProjection[] movies = metadataItemsRepository.findMetadataAndMedia().toArray(new MovieProjection[0]);

        for(MovieProjection movieProjection: movies) {
            Movies movie = new Movies(
                    movieProjection.getTitle(),
                    movieProjection.getDescription(),
                    movieProjection.getRating(),
                    movieProjection.getReleaseDate(),
                    movieProjection.getDuration(),
                    movieProjection.getYear(),
                    movieProjection.getDirector(),
                    movieProjection.getWriter(),
                    movieProjection.getGenres(),
                    movieProjection.getStars(),
                    movieProjection.getAudio(),
                    movieProjection.getSubtitles()
            );
            moviesList.add(movie);
        }
        moviesRepository.saveAll(moviesList);
        return ResponseEntity.ok("Movie Test" + " " + moviesList.size());
    }
}
