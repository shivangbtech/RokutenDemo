
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("actors")
    private List<Actor> mActors;
    @SerializedName("additional_images")
    private AdditionalImages mAdditionalImages;
    @SerializedName("awards")
    private List<Award> mAwards;
    @SerializedName("classification")
    private Classification mClassification;
    @SerializedName("countries")
    private List<Country> mCountries;
    @SerializedName("critic_reviews")
    private CriticReviews mCriticReviews;
    @SerializedName("deep_links")
    private DeepLinks mDeepLinks;
    @SerializedName("directors")
    private List<Director> mDirectors;
    @SerializedName("duration")
    private Long mDuration;
    @SerializedName("duration_in_seconds")
    private Object mDurationInSeconds;
    @SerializedName("extras")
    private List<Object> mExtras;
    @SerializedName("genres")
    private List<Genre> mGenres;
    @SerializedName("groups")
    private List<Object> mGroups;
    @SerializedName("highlight")
    private String mHighlight;
    @SerializedName("id")
    private String mId;
    @SerializedName("images")
    private Images mImages;
    @SerializedName("numerical_id")
    private Long mNumericalId;
    @SerializedName("offline_enabled_for_est")
    private Boolean mOfflineEnabledForEst;
    @SerializedName("offline_enabled_for_rent")
    private Boolean mOfflineEnabledForRent;
    @SerializedName("offline_enabled_for_svod")
    private Boolean mOfflineEnabledForSvod;
    @SerializedName("order_options")
    private List<OrderOption> mOrderOptions;
    @SerializedName("original_title")
    private String mOriginalTitle;
    @SerializedName("plot")
    private String mPlot;
    @SerializedName("rating")
    private Rating mRating;
    @SerializedName("scores")
    private List<Score> mScores;
    @SerializedName("short_plot")
    private String mShortPlot;
    @SerializedName("subscription_plans")
    private List<Object> mSubscriptionPlans;
    @SerializedName("svod_schedules")
    private List<Object> mSvodSchedules;
    @SerializedName("tags")
    private List<Object> mTags;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("type")
    private String mType;
    @SerializedName("ultraviolet_enabled")
    private Boolean mUltravioletEnabled;
    @SerializedName("user_reviews")
    private UserReviews mUserReviews;
    @SerializedName("view_options")
    private ViewOptions mViewOptions;
    @SerializedName("year")
    private Long mYear;

    public List<Actor> getActors() {
        return mActors;
    }

    public void setActors(List<Actor> actors) {
        mActors = actors;
    }

    public AdditionalImages getAdditionalImages() {
        return mAdditionalImages;
    }

    public void setAdditionalImages(AdditionalImages additionalImages) {
        mAdditionalImages = additionalImages;
    }

    public List<Award> getAwards() {
        return mAwards;
    }

    public void setAwards(List<Award> awards) {
        mAwards = awards;
    }

    public Classification getClassification() {
        return mClassification;
    }

    public void setClassification(Classification classification) {
        mClassification = classification;
    }

    public List<Country> getCountries() {
        return mCountries;
    }

    public void setCountries(List<Country> countries) {
        mCountries = countries;
    }

    public CriticReviews getCriticReviews() {
        return mCriticReviews;
    }

    public void setCriticReviews(CriticReviews criticReviews) {
        mCriticReviews = criticReviews;
    }

    public DeepLinks getDeepLinks() {
        return mDeepLinks;
    }

    public void setDeepLinks(DeepLinks deepLinks) {
        mDeepLinks = deepLinks;
    }

    public List<Director> getDirectors() {
        return mDirectors;
    }

    public void setDirectors(List<Director> directors) {
        mDirectors = directors;
    }

    public Long getDuration() {
        return mDuration;
    }

    public void setDuration(Long duration) {
        mDuration = duration;
    }

    public Object getDurationInSeconds() {
        return mDurationInSeconds;
    }

    public void setDurationInSeconds(Object durationInSeconds) {
        mDurationInSeconds = durationInSeconds;
    }

    public List<Object> getExtras() {
        return mExtras;
    }

    public void setExtras(List<Object> extras) {
        mExtras = extras;
    }

    public List<Genre> getGenres() {
        return mGenres;
    }

    public void setGenres(List<Genre> genres) {
        mGenres = genres;
    }

    public List<Object> getGroups() {
        return mGroups;
    }

    public void setGroups(List<Object> groups) {
        mGroups = groups;
    }

    public String getHighlight() {
        return mHighlight;
    }

    public void setHighlight(String highlight) {
        mHighlight = highlight;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Images getImages() {
        return mImages;
    }

    public void setImages(Images images) {
        mImages = images;
    }

    public Long getNumericalId() {
        return mNumericalId;
    }

    public void setNumericalId(Long numericalId) {
        mNumericalId = numericalId;
    }

    public Boolean getOfflineEnabledForEst() {
        return mOfflineEnabledForEst;
    }

    public void setOfflineEnabledForEst(Boolean offlineEnabledForEst) {
        mOfflineEnabledForEst = offlineEnabledForEst;
    }

    public Boolean getOfflineEnabledForRent() {
        return mOfflineEnabledForRent;
    }

    public void setOfflineEnabledForRent(Boolean offlineEnabledForRent) {
        mOfflineEnabledForRent = offlineEnabledForRent;
    }

    public Boolean getOfflineEnabledForSvod() {
        return mOfflineEnabledForSvod;
    }

    public void setOfflineEnabledForSvod(Boolean offlineEnabledForSvod) {
        mOfflineEnabledForSvod = offlineEnabledForSvod;
    }

    public List<OrderOption> getOrderOptions() {
        return mOrderOptions;
    }

    public void setOrderOptions(List<OrderOption> orderOptions) {
        mOrderOptions = orderOptions;
    }

    public String getOriginalTitle() {
        return mOriginalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        mOriginalTitle = originalTitle;
    }

    public String getPlot() {
        return mPlot;
    }

    public void setPlot(String plot) {
        mPlot = plot;
    }

    public Rating getRating() {
        return mRating;
    }

    public void setRating(Rating rating) {
        mRating = rating;
    }

    public List<Score> getScores() {
        return mScores;
    }

    public void setScores(List<Score> scores) {
        mScores = scores;
    }

    public String getShortPlot() {
        return mShortPlot;
    }

    public void setShortPlot(String shortPlot) {
        mShortPlot = shortPlot;
    }

    public List<Object> getSubscriptionPlans() {
        return mSubscriptionPlans;
    }

    public void setSubscriptionPlans(List<Object> subscriptionPlans) {
        mSubscriptionPlans = subscriptionPlans;
    }

    public List<Object> getSvodSchedules() {
        return mSvodSchedules;
    }

    public void setSvodSchedules(List<Object> svodSchedules) {
        mSvodSchedules = svodSchedules;
    }

    public List<Object> getTags() {
        return mTags;
    }

    public void setTags(List<Object> tags) {
        mTags = tags;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public Boolean getUltravioletEnabled() {
        return mUltravioletEnabled;
    }

    public void setUltravioletEnabled(Boolean ultravioletEnabled) {
        mUltravioletEnabled = ultravioletEnabled;
    }

    public UserReviews getUserReviews() {
        return mUserReviews;
    }

    public void setUserReviews(UserReviews userReviews) {
        mUserReviews = userReviews;
    }

    public ViewOptions getViewOptions() {
        return mViewOptions;
    }

    public void setViewOptions(ViewOptions viewOptions) {
        mViewOptions = viewOptions;
    }

    public Long getYear() {
        return mYear;
    }

    public void setYear(Long year) {
        mYear = year;
    }

}
