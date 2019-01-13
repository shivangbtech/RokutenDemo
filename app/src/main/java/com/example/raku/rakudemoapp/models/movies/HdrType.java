
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

public class HdrType {

    @SerializedName("abbr")
    private String mAbbr;
    @SerializedName("id")
    private String mId;
    @SerializedName("image")
    private Object mImage;
    @SerializedName("name")
    private String mName;
    @SerializedName("numerical_id")
    private Long mNumericalId;
    @SerializedName("type")
    private String mType;

    public String getAbbr() {
        return mAbbr;
    }

    public void setAbbr(String abbr) {
        mAbbr = abbr;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Object getImage() {
        return mImage;
    }

    public void setImage(Object image) {
        mImage = image;
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
