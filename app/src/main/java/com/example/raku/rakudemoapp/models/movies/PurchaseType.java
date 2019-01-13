
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

public class PurchaseType {

    @SerializedName("available_time_in_seconds")
    private Long mAvailableTimeInSeconds;
    @SerializedName("expires_after_in_seconds")
    private Long mExpiresAfterInSeconds;
    @SerializedName("id")
    private String mId;
    @SerializedName("is_recurring")
    private Boolean mIsRecurring;
    @SerializedName("kind")
    private String mKind;
    @SerializedName("numerical_id")
    private Long mNumericalId;
    @SerializedName("type")
    private String mType;

    public Long getAvailableTimeInSeconds() {
        return mAvailableTimeInSeconds;
    }

    public void setAvailableTimeInSeconds(Long availableTimeInSeconds) {
        mAvailableTimeInSeconds = availableTimeInSeconds;
    }

    public Long getExpiresAfterInSeconds() {
        return mExpiresAfterInSeconds;
    }

    public void setExpiresAfterInSeconds(Long expiresAfterInSeconds) {
        mExpiresAfterInSeconds = expiresAfterInSeconds;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Boolean getIsRecurring() {
        return mIsRecurring;
    }

    public void setIsRecurring(Boolean isRecurring) {
        mIsRecurring = isRecurring;
    }

    public String getKind() {
        return mKind;
    }

    public void setKind(String kind) {
        mKind = kind;
    }

    public Long getNumericalId() {
        return mNumericalId;
    }

    public void setNumericalId(Long numericalId) {
        mNumericalId = numericalId;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
