package com.cleverpine.plex.entity.legacy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "media_streams")
public class MediaStreams {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name = "stream_type_id")
    private Integer streamTypeId;

    @Column(name = "media_item_id")
    private Integer mediaItemId;

    @Column(name = "url")
    private String url;

    @Column(name = "codec")
    private String codec;

    @Column(name = "language")
    private String language;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "\"index\"")
    private Integer index;

    @Column(name = "media_part_id")
    private Integer mediaPartId;

    @Column(name = "channels")
    private Integer channels;

    @Column(name = "bitrate")
    private Integer bitrate;

    @Column(name = "url_index")
    private Integer urlIndex;

    @Column(name = "\"default\"")
    private Boolean defaultValue;

    @Column(name = "forced")
    private Boolean forced;

    @Column(name = "extraData")
    private String extraData;

    protected MediaStreams() {}

    public MediaStreams(Integer id, Integer streamTypeId, Integer mediaItemId, String url, String codec, String language, LocalDateTime createdAt, LocalDateTime updatedAt, Integer index, Integer mediaPartId, Integer channels, Integer bitrate, Integer urlIndex, Boolean defaultValue, Boolean forced, String extraData) {
        this.id = id;
        this.streamTypeId = streamTypeId;
        this.mediaItemId = mediaItemId;
        this.url = url;
        this.codec = codec;
        this.language = language;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.index = index;
        this.mediaPartId = mediaPartId;
        this.channels = channels;
        this.bitrate = bitrate;
        this.urlIndex = urlIndex;
        this.defaultValue = defaultValue;
        this.forced = forced;
        this.extraData = extraData;
    }

    public Integer getId() {
        return id;
    }

    public Integer getStreamTypeId() {
        return streamTypeId;
    }

    public Integer getMediaItemId() {
        return mediaItemId;
    }

    public String getUrl() {
        return url;
    }

    public String getCodec() {
        return codec;
    }

    public String getLanguage() {
        return language;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Integer getIndex() {
        return index;
    }

    public Integer getMediaPartId() {
        return mediaPartId;
    }

    public Integer getChannels() {
        return channels;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public Integer getUrlIndex() {
        return urlIndex;
    }

    public Boolean getDefaultValue() {
        return defaultValue;
    }

    public Boolean getForced() {
        return forced;
    }

    public String getExtraData() {
        return extraData;
    }
}

