package com.cleverpine.plex.entity.legacy;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="metadata_items")
public class MetadataItems {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="library_section_id")
    private Integer librarySectionId;

    @Column(name="parent_id")
    private Integer parentId;

    @Column(name="metadata_type")
    private Integer metadataType;

    @Column(name="guid")
    private String guid;

    @Column(name="media_item_count")
    private Integer mediaItemCount;

    @Column(name = "title")
    private String title;

    @Column(name = "title_sort")
    private String titleSort;

    @Column(name = "original_title")
    private String originalTitle;

    @Column(name = "studio")
    private String studio;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "rating_count")
    private Integer ratingCount;

    @Column(name = "tagline")
    private String tagline;

    @Column(name = "summary")
    private String summary;

    @Column(name = "trivia")
    private String trivia;

    @Column(name = "quotes")
    private String quotes;

    @Column(name = "content_rating")
    private String contentRating;

    @Column(name = "content_rating_age")
    private Integer contentRatingAge;

    @Column(name = "\"index\"")
    private Integer index;

    @Column(name = "absolute_index")
    private Integer absoluteIndex;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "user_thumb_url")
    private String userThumbUrl;

    @Column(name = "user_art_url")
    private String userArtUrl;

    @Column(name = "user_banner_url")
    private String userBannerUrl;

    @Column(name = "user_music_url")
    private String  userMusicUrl;

    @Column(name = "user_fields")
    private String userFields;

    @Column(name = "tags_genre")
    private String tagsGenre;

    @Column(name = "tags_collection")
    private String tagsCollection;

    @Column(name = "tags_director")
    private String tagsDirector;

    @Column(name = "tags_writer")
    private String tagsWriter;

    @Column(name = "tags_star")
    private String tagsStar;

    @Column(name = "originally_available_at")
    private LocalDateTime originallyAvailableAt;

    @Column(name = "available_at")
    private LocalDateTime availableAt;

    @Column(name = "expires_at")
    private LocalDateTime expiresaAt;

    @Column(name = "refreshed_at")
    private LocalDateTime refreshedAt;

    @Column(name = "year")
    private Integer year;

    @Column(name = "added_at")
    private LocalDateTime addedAt;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "tags_country")
    private String tagsCountry;

    @Column(name = "extra_data")
    private String extraData;

    @Column(name = "hash")
    private String hash;

    @Column(name = "audience_rating")
    private Double audienceRating;

    @Column(name = "changed_at")
    private Integer changedAt;

    @Column(name = "resources_changed_at")
    private Integer resourcesChangedAt;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "metadata_item_id")
    private Set<MediaItems> mediaItems;


    protected MetadataItems() {}

    public MetadataItems(Integer id, Integer librarySectionId, Integer parentId, Integer metadataType, String guid, Integer mediaItemCount, String title, String titleSort, String originalTitle, String studio, Double rating, Integer ratingCount, String tagline, String summary, String trivia, String quotes, String contentRating, Integer contentRatingAge, Integer index, Integer absoluteIndex, Integer duration, String userThumbUrl, String userArtUrl, String userBannerUrl, String userMusicUrl, String userFields, String tagsGenre, String tagsCollection, String tagsDirector, String tagsWriter, String tagsStar, LocalDateTime originallyAvailableAt, LocalDateTime availableAt, LocalDateTime expiresaAt, LocalDateTime refreshedAt, Integer year, LocalDateTime addedAt, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt, String tagsCountry, String extraData, String hash, Double audienceRating, Integer changedAt, Integer resourcesChangedAt) {
        this.id = id;
        this.librarySectionId = librarySectionId;
        this.parentId = parentId;
        this.metadataType = metadataType;
        this.guid = guid;
        this.mediaItemCount = mediaItemCount;
        this.title = title;
        this.titleSort = titleSort;
        this.originalTitle = originalTitle;
        this.studio = studio;
        this.rating = rating;
        this.ratingCount = ratingCount;
        this.tagline = tagline;
        this.summary = summary;
        this.trivia = trivia;
        this.quotes = quotes;
        this.contentRating = contentRating;
        this.contentRatingAge = contentRatingAge;
        this.index = index;
        this.absoluteIndex = absoluteIndex;
        this.duration = duration;
        this.userThumbUrl = userThumbUrl;
        this.userArtUrl = userArtUrl;
        this.userBannerUrl = userBannerUrl;
        this.userMusicUrl = userMusicUrl;
        this.userFields = userFields;
        this.tagsGenre = tagsGenre;
        this.tagsCollection = tagsCollection;
        this.tagsDirector = tagsDirector;
        this.tagsWriter = tagsWriter;
        this.tagsStar = tagsStar;
        this.originallyAvailableAt = originallyAvailableAt;
        this.availableAt = availableAt;
        this.expiresaAt = expiresaAt;
        this.refreshedAt = refreshedAt;
        this.year = year;
        this.addedAt = addedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.tagsCountry = tagsCountry;
        this.extraData = extraData;
        this.hash = hash;
        this.audienceRating = audienceRating;
        this.changedAt = changedAt;
        this.resourcesChangedAt = resourcesChangedAt;
    }

    public Integer getId() {
        return id;
    }

    public Integer getLibrarySectionId() {
        return librarySectionId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Integer getMetadataType() {
        return metadataType;
    }

    public String getGuid() {
        return guid;
    }

    public Integer getMediaItemCount() {
        return mediaItemCount;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleSort() {
        return titleSort;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getStudio() {
        return studio;
    }

    public Double getRating() {
        return rating;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public String getTagline() {
        return tagline;
    }

    public String getSummary() {
        return summary;
    }

    public String getTrivia() {
        return trivia;
    }

    public String getQuotes() {
        return quotes;
    }

    public String getContentRating() {
        return contentRating;
    }

    public Integer getContentRatingAge() {
        return contentRatingAge;
    }

    public Integer getIndex() {
        return index;
    }

    public Integer getAbsoluteIndex() {
        return absoluteIndex;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getUserThumbUrl() {
        return userThumbUrl;
    }

    public String getUserArtUrl() {
        return userArtUrl;
    }

    public String getUserBannerUrl() {
        return userBannerUrl;
    }

    public String getUserMusicUrl() {
        return userMusicUrl;
    }

    public String getUserFields() {
        return userFields;
    }

    public String getTagsGenre() {
        return tagsGenre;
    }

    public String getTagsCollection() {
        return tagsCollection;
    }

    public String getTagsDirector() {
        return tagsDirector;
    }

    public String getTagsWriter() {
        return tagsWriter;
    }

    public String getTagsStar() {
        return tagsStar;
    }

    public LocalDateTime getOriginallyAvailableAt() {
        return originallyAvailableAt;
    }

    public LocalDateTime getAvailableAt() {
        return availableAt;
    }

    public LocalDateTime getExpiresaAt() {
        return expiresaAt;
    }

    public LocalDateTime getRefreshedAt() {
        return refreshedAt;
    }

    public Integer getYear() {
        return year;
    }

    public LocalDateTime getAddedAt() {
        return addedAt;
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

    public String getTagsCountry() {
        return tagsCountry;
    }

    public String getExtraData() {
        return extraData;
    }

    public String getHash() {
        return hash;
    }

    public Double getAudienceRating() {
        return audienceRating;
    }

    public Integer getChangedAt() {
        return changedAt;
    }

    public Integer getResourcesChangedAt() {
        return resourcesChangedAt;
    }
}
