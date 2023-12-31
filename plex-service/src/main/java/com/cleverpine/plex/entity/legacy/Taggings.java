package com.cleverpine.plex.entity.legacy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="taggings")
public class Taggings {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name = "metadata_item_id")
    private Integer metadataItemId;

    @Column(name = "tag_id")
    private Integer tagId;

    @Column(name = "\"index\"")
    private Integer index;

    @Column(name = "text")
    private String text;

    @Column(name = "time_offset")
    private Integer timeOffset;

    @Column(name = "end_time_offset")
    private Integer endTimeOffset;

    @Column(name = "thumb_url")
    private String thumbUrl;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "extra_data")
    private String extraData;

    protected Taggings() {}
    public Taggings(Integer id, Integer metadataItemId, Integer tagId, Integer index, String text, Integer timeOffset, Integer endTimeOffset, String thumbUrl, LocalDateTime createdAt, String extraData) {
        this.id = id;
        this.metadataItemId = metadataItemId;
        this.tagId = tagId;
        this.index = index;
        this.text = text;
        this.timeOffset = timeOffset;
        this.endTimeOffset = endTimeOffset;
        this.thumbUrl = thumbUrl;
        this.createdAt = createdAt;
        this.extraData = extraData;
    }

    public Integer getId() {
        return id;
    }

    public Integer getMetadataItemId() {
        return metadataItemId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public Integer getIndex() {
        return index;
    }

    public String getText() {
        return text;
    }

    public Integer getTimeOffset() {
        return timeOffset;
    }

    public Integer getEndTimeOffset() {
        return endTimeOffset;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getExtraData() {
        return extraData;
    }
}
