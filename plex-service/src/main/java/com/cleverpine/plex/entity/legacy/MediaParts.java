package com.cleverpine.plex.entity.legacy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "media_parts")
public class MediaParts {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name = "media_item_id")
    private Integer mediaItemId;

    @Column(name = "directory_id")
    private Integer directoryId;

    @Column(name = "hash")
    private String hash;

    @Column(name = "open_subtitle_hash")
    private String openSubtitleHash;

    @Column(name = "\"file\"")
    private String file;

    @Column(name = "\"index\"")
    private Integer index;

    @Column(name = "size")
    private Integer size;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;


    @Column(name = "extra_data")
    private String extraData;

    protected MediaParts() {}

    public MediaParts(Integer id, Integer mediaItemId, Integer directoryId, String hash, String openSubtitleHash, String file, Integer index, Integer size, Integer duration, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, String extraData) {
        this.id = id;
        this.mediaItemId = mediaItemId;
        this.directoryId = directoryId;
        this.hash = hash;
        this.openSubtitleHash = openSubtitleHash;
        this.file = file;
        this.index = index;
        this.size = size;
        this.duration = duration;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.extraData = extraData;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMediaItemId() {
        return mediaItemId;
    }

    public Integer getDirectoryId() {
        return directoryId;
    }

    public String getHash() {
        return hash;
    }

    public String getOpenSubtitleHash() {
        return openSubtitleHash;
    }

    public String getFile() {
        return file;
    }

    public Integer getIndex() {
        return index;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getDuration() {
        return duration;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public String getExtraData() {
        return extraData;
    }
}
