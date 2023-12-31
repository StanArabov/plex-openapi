package com.cleverpine.plex.entity.legacy;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="media_items")
public class MediaItems {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name = "library_section_id")
    private Integer librarySectionId;

    @Column(name = "section_location_id")
    private Integer sectionLocationId;

    @Column(name = "metadata_item_id")
    private Integer metadataItemId;

    @Column(name = "type_id")
    private Integer typeId;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @Column(name = "size")
    private Integer size;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "bitrate")
    private Integer bitrate;

    @Column(name = "container")
    private String container;

    @Column(name = "video_codec")
    private String videoCodec;

    @Column(name = "audio_codec")
    private String audioCodec;

    @Column(name = "display_aspect_ratio")
    private Double displayAspectRatio;


    @Column(name = "frames_per_second")
    private Double framesPerSecond;

    @Column(name = "audio_channels")
    private Integer audioChannels;

    @Column(name = "interlaced")
    private Boolean interlaced;

    @Column(name = "source")
    private String source;

    @Column(name = "hints")
    private String hints;

    @Column(name = "display_offset")
    private Integer displayOffset;

    @Column(name = "settings")
    private String settings;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "optimized_for_streaming")
    private Boolean optimizedForStreaming;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "media_analysis_version")
    private Integer mediaAnalysisVersion;

    @Column(name = "sample_aspect_ratio")
    private String sampleAspectRatio;

    @Column(name = "extra_data")
    private String extraData;

    @Column(name = "proxy_type")
    private String proxyType;

    @Column(name = "channel_id")
    private Long channelId;

    @Column(name = "begins_at")
    private LocalDateTime beginsAt;

    @Column(name = "ends_at")
    private LocalDateTime endsAt;

//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "media_item_id")
//    private Set<MediaParts> mediaParts;

    protected MediaItems() {}

    public MediaItems(Integer id, Integer librarySectionId, Integer sectionLocationId, Integer metadataItemId, Integer typeId, Integer width, Integer height, Integer size, Integer duration, Integer bitrate, String container, String videoCodec, String audioCodec, Double displayAspectRatio, Double framesPerSecond, Integer audioChannels, Boolean interlaced, String source, String hints, Integer displayOffset, String settings, LocalDateTime createdAt, LocalDateTime updatedAt, Boolean optimizedForStreaming, LocalDateTime deletedAt, Integer mediaAnalysisVersion, String sampleAspectRatio, String extraData, String proxyType, Long channelId, LocalDateTime beginsAt, LocalDateTime endsAt) {
        this.id = id;
        this.librarySectionId = librarySectionId;
        this.sectionLocationId = sectionLocationId;
        this.metadataItemId = metadataItemId;
        this.typeId = typeId;
        this.width = width;
        this.height = height;
        this.size = size;
        this.duration = duration;
        this.bitrate = bitrate;
        this.container = container;
        this.videoCodec = videoCodec;
        this.audioCodec = audioCodec;
        this.displayAspectRatio = displayAspectRatio;
        this.framesPerSecond = framesPerSecond;
        this.audioChannels = audioChannels;
        this.interlaced = interlaced;
        this.source = source;
        this.hints = hints;
        this.displayOffset = displayOffset;
        this.settings = settings;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.optimizedForStreaming = optimizedForStreaming;
        this.deletedAt = deletedAt;
        this.mediaAnalysisVersion = mediaAnalysisVersion;
        this.sampleAspectRatio = sampleAspectRatio;
        this.extraData = extraData;
        this.proxyType = proxyType;
        this.channelId = channelId;
        this.beginsAt = beginsAt;
        this.endsAt = endsAt;
    }

    public Integer getId() {
        return id;
    }

    public Integer getLibrarySectionId() {
        return librarySectionId;
    }

    public Integer getSectionLocationId() {
        return sectionLocationId;
    }

    public Integer getMetadataItemId() {
        return metadataItemId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public String getContainer() {
        return container;
    }

    public String getVideoCodec() {
        return videoCodec;
    }

    public String getAudioCodec() {
        return audioCodec;
    }

    public Double getDisplayAspectRatio() {
        return displayAspectRatio;
    }

    public Double getFramesPerSecond() {
        return framesPerSecond;
    }

    public Integer getAudioChannels() {
        return audioChannels;
    }

    public Boolean getInterlaced() {
        return interlaced;
    }

    public String getSource() {
        return source;
    }

    public String getHints() {
        return hints;
    }

    public Integer getDisplayOffset() {
        return displayOffset;
    }

    public String getSettings() {
        return settings;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Boolean getOptimizedForStreaming() {
        return optimizedForStreaming;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public Integer getMediaAnalysisVersion() {
        return mediaAnalysisVersion;
    }

    public String getSampleAspectRatio() {
        return sampleAspectRatio;
    }

    public String getExtraData() {
        return extraData;
    }

    public String getProxyType() {
        return proxyType;
    }

    public Long getChannelId() {
        return channelId;
    }

    public LocalDateTime getBeginsAt() {
        return beginsAt;
    }

    public LocalDateTime getEndsAt() {
        return endsAt;
    }
}
