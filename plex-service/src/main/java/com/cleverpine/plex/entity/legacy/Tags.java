package com.cleverpine.plex.entity.legacy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "tags")
public class Tags {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "metadata_item_id")
    private Integer metadataItemId;

    @Column(name = "tag")
    private String tag;

    @Column(name = "tag_type")
    private Integer tagType;

    @Column(name = "user_thumb_url")
    private String userThumbUrl;

    @Column(name = "user_art_url")
    private String userArtUrl;

    @Column(name = "user_music_url")
    private String userMusicUrl;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "tag_value")
    private Integer tagValue;

    @Column(name = "extra_data")
    private String extraData;

    @Column(name = "\"key\"")
    private String key;

    protected Tags() {}

    public Tags(Integer id, Integer metadataItemId, String tag, Integer tagType, String userThumbUrl, String userArtUrl, String userMusicUrl, LocalDateTime createdAt, LocalDateTime updatedAt, Integer tagValue, String extraData, String key) {
        this.id = id;
        this.metadataItemId = metadataItemId;
        this.tag = tag;
        this.tagType = tagType;
        this.userThumbUrl = userThumbUrl;
        this.userArtUrl = userArtUrl;
        this.userMusicUrl = userMusicUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.tagValue = tagValue;
        this.extraData = extraData;
        this.key = key;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMetadataItemId() {
        return metadataItemId;
    }

    public String getTag() {
        return tag;
    }

    public Integer getTagType() {
        return tagType;
    }

    public String getUserThumbUrl() {
        return userThumbUrl;
    }

    public String getUserArtUrl() {
        return userArtUrl;
    }

    public String getUserMusicUrl() {
        return userMusicUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Integer getTagValue() {
        return tagValue;
    }

    public String getExtraData() {
        return extraData;
    }

    public String getKey() {
        return key;
    }
}
