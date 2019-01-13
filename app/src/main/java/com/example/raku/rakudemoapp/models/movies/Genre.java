
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

public class Genre {

    @SerializedName("additional_images")
    private AdditionalImages mAdditionalImages;
    @SerializedName("adult")
    private Boolean mAdult;
    @SerializedName("erotic")
    private Boolean mErotic;
    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("numerical_id")
    private Long mNumericalId;
    @SerializedName("type")
    private String mType;

    public AdditionalImages getAdditionalImages() {
        return mAdditionalImages;
    }

    public void setAdditionalImages(AdditionalImages additionalImages) {
        mAdditionalImages = additionalImages;
    }

    public Boolean getAdult() {
        return mAdult;
    }

    public void setAdult(Boolean adult) {
        mAdult = adult;
    }

    public Boolean getErotic() {
        return mErotic;
    }

    public void setErotic(Boolean erotic) {
        mErotic = erotic;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
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
