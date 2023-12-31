package com.cleverpine.plex.repository.legacy;

import com.cleverpine.plex.entity.legacy.MetadataItems;
import com.cleverpine.plex.projection.MovieDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MetadataItemsRepository extends JpaRepository<MetadataItems, Integer> {

    @Query("SELECT " +
            "meta.title AS title, " +
            "meta.summary as description, " +
            "meta.rating as rating, " +
            "meta.originallyAvailableAt as releaseDate, " +
            "mediaParts.duration AS duration, " +
            "meta.year as year, " +
            "GROUP_CONCAT(DISTINCT(CASE WHEN tags.tagType = 4 THEN cast(tags.tag AS char) END)) AS director, " +
            "GROUP_CONCAT(DISTINCT(CASE WHEN tags.tagType = 5 THEN cast(tags.tag AS char) END)) AS writers, " +
            "GROUP_CONCAT(DISTINCT(CASE WHEN tags.tagType = 6 THEN cast(tags.tag AS char) END)) AS actors, " +
            "GROUP_CONCAT(DISTINCT(CASE WHEN tags.tagType = 1 THEN cast(tags.tag AS char) END)) AS genres, " +
            "GROUP_CONCAT(DISTINCT(CASE WHEN mediaStreams.streamTypeId = 1 THEN cast(mediaStreams.language AS char) END)) AS language " +
            "FROM MetadataItems meta " +
            "LEFT JOIN MediaItems mediaItems on meta.id = mediaItems.metadataItemId " +
            "LEFT JOIN MediaParts mediaParts on mediaItems.id = mediaParts.mediaItemId " +
            "LEFT JOIN MediaStreams mediaStreams on mediaItems.id = mediaStreams.mediaItemId " +
            "LEFT JOIN Taggings taggings on meta.id = taggings.metadataItemId " +
            "LEFT JOIN StreamTypes streamTypes on mediaStreams.streamTypeId = streamTypes.id " +
            "LEFT JOIN Tags tags on taggings.tagId = tags.id " +
            "WHERE meta.metadataType = 1 " +
            "AND meta.librarySectionId NOT IN (9, 10, 13, 14)" +
            "GROUP BY meta.title"
    )
    List<MovieDto> findMetadataAndMedia();
}
