
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

public class Ribbon {

    @SerializedName("color")
    private String mColor;
    @SerializedName("id")
    private String mId;
    @SerializedName("image")
    private String mImage;
    @SerializedName("localized_name")
    private String mLocalizedName;
    @SerializedName("name")
    private String mName;
    @SerializedName("numerical_id")
    private Long mNumericalId;
    @SerializedName("position")
    private String mPosition;
    @SerializedName("text_color")
    private String mTextColor;
    @SerializedName("type")
    private String mType;

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getLocalizedName() {
        return mLocalizedName;
    }

    public void setLocalizedName(String localizedName) {
        mLocalizedName = localizedName;
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

    public String getPosition() {
        return mPosition;
    }

    public void setPosition(String position) {
        mPosition = position;
    }

    public String getTextColor() {
        return mTextColor;
    }

    public void setTextColor(String textColor) {
        mTextColor = textColor;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
