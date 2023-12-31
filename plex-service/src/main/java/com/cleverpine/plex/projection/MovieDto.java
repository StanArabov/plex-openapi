package com.cleverpine.plex.projection;

import java.time.LocalDateTime;
import java.util.List;

public interface MovieDto {
    String getTitle();

    String getDescription();

    Double getRating();

    LocalDateTime getReleaseDate();

    Integer getDuration();

    Integer getYear();

    List<String> getDirector();

    List<String>  getWriters();

    List<String>  getActors();

    List<String> getGenres();

    List<String>  gerLanguage();
}
