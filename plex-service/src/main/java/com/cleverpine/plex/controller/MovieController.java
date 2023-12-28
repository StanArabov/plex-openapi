package com.cleverpine.plex.controller;

import com.cleverpine.plex.api.MoviesApi;
import com.cleverpine.plex.auth.ViravaSecured;
import com.cleverpine.plex.auth.roles.Resources;
import com.cleverpine.viravaspringhelper.dto.ScopeType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MovieController implements MoviesApi {

    @Override
    @ViravaSecured(resource = Resources.MOVIES, scope = ScopeType.READ)
    public ResponseEntity<String> apiMoviesTestGet() {
        return ResponseEntity.ok("Movie Test");
    }
}
