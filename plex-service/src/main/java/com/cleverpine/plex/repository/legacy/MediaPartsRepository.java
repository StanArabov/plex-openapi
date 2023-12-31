package com.cleverpine.plex.repository.legacy;

import com.cleverpine.plex.entity.legacy.MediaParts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaPartsRepository extends JpaRepository<MediaParts, Integer> {
}
