package com.cleverpine.plex.projection;

import java.time.LocalDateTime;

public interface MovieProjection {
    String getTitle();

    String getDescription();

    Double getRating();

    LocalDateTime getReleaseDate();

    Integer getDuration();

    Integer getYear();

    String getDirector();

    String getWriter();

    String  getStars();

    String getGenres();

    String  getAudio();

    String getSubtitles();
}
