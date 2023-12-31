package com.cleverpine.plex.controller;

import com.cleverpine.plex.api.MoviesApi;
import com.cleverpine.plex.auth.ViravaSecured;
import com.cleverpine.plex.auth.roles.Resources;
import com.cleverpine.plex.entity.legacy.Device;
import com.cleverpine.plex.entity.legacy.MediaParts;
import com.cleverpine.plex.entity.legacy.MetadataItems;
import com.cleverpine.plex.projection.MovieDto;
import com.cleverpine.plex.repository.legacy.DeviceRepository;
import com.cleverpine.plex.repository.legacy.MediaPartsRepository;
import com.cleverpine.plex.repository.legacy.MetadataItemsRepository;
import com.cleverpine.viravaspringhelper.dto.ScopeType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController implements MoviesApi {

    final private DeviceRepository deviceRepository;
    final private MetadataItemsRepository metadataItemsRepository;
    final private MediaPartsRepository mediaPartsRepository;

    @Override
    @ViravaSecured(resource = Resources.MOVIES, scope = ScopeType.READ)
    public ResponseEntity<String> apiMoviesTestGet() {

        //Device[] devices = deviceRepository.findAll().toArray(new Device[0]);
//        MetadataItems[] items = metadataItemsRepository.findAll().toArray(new MetadataItems[0]);
        MovieDto[] movies = metadataItemsRepository.findMetadataAndMedia().toArray(new MovieDto[0]);
//        System.out.println(movies[0].toString());
//        System.out.println();
        for(MovieDto movieDto : movies) {
            System.out.print(movieDto.getTitle());
            System.out.print(" ");
            System.out.print(movieDto.getDescription());
            System.out.print(" ");
            System.out.print(movieDto.getRating());
            System.out.print(" ");
            System.out.print(movieDto.getDuration());
            System.out.print(" ");
            System.out.print(movieDto.getYear());
            System.out.print(" ");
//            System.out.print(movieDto.getDirector());
//            System.out.print(" ");
//            System.out.print(movieDto.getWriters());
//            System.out.print(" ");
//            System.out.print(movieDto.getGenres());
//            System.out.print(" ");
//            System.out.print(movieDto.getActors());
//            System.out.print(" ");
//            System.out.println(movieDto.getReleaseDate());

        }
        //MediaParts[] parts = mediaPartsRepository.findAll().toArray(new MediaParts[0]);
        return ResponseEntity.ok("Movie Test" + " " + movies.length); //+ devices.length + " " + parts.length);
    }
}
