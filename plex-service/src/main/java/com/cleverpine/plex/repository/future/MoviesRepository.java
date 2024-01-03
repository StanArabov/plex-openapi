package com.cleverpine.plex.repository.future;

import com.cleverpine.plex.entity.future.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies, Integer> {
}
