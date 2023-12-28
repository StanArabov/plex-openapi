package com.cleverpine.plex.controller;

import com.cleverpine.plex.api.MoviesApi;
import com.cleverpine.plex.auth.ViravaSecured;
import com.cleverpine.plex.auth.roles.Resources;
import com.cleverpine.plex.entity.legacy.Device;
import com.cleverpine.plex.repository.legacy.DeviceRepository;
import com.cleverpine.viravaspringhelper.dto.ScopeType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MovieController implements MoviesApi {

    final private DeviceRepository deviceRepository;

    @Override
    @ViravaSecured(resource = Resources.MOVIES, scope = ScopeType.READ)
    public ResponseEntity<String> apiMoviesTestGet() {

        Device[] devices = deviceRepository.findAll().toArray(new Device[0]);
        return ResponseEntity.ok("Movie Test" + " " + devices.length);
    }

//    @ViravaSecured(resource = Resources.MOVIES, scope = ScopeType.READ)
//    public ResponseEntity<Device[]> getDevices() {
//        Device[] devices = deviceRepository.findAll().toArray(new Device[0]);
//        return ResponseEntity.ok(devices);
//    }
}
