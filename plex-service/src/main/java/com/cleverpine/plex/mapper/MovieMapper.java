package com.cleverpine.plex.mapper;

import com.cleverpine.plex.dto.MovieDto;
import com.cleverpine.plex.model.MovieListItem;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {

    public MovieListItem movieDtoToMovieListItem(MovieDto movieDto) {
        MovieListItem item = new MovieListItem();
        item.setId(movieDto.getId());
        item.setTitle(movieDto.getTitle());
        return item;
    }

}
