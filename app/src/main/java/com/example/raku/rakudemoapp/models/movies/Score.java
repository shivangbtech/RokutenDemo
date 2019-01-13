
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

public class Score {

    @SerializedName("amount_of_votes")
    private Object mAmountOfVotes;
    @SerializedName("formatted_amount_of_votes")
    private Object mFormattedAmountOfVotes;
    @SerializedName("highlighted")
    private Boolean mHighlighted;
    @SerializedName("href")
    private String mHref;
    @SerializedName("id")
    private String mId;
    @SerializedName("numerical_id")
    private Long mNumericalId;
    @SerializedName("score")
    private Double mScore;
    @SerializedName("site")
    private Site mSite;
    @SerializedName("type")
    private String mType;

    public Object getAmountOfVotes() {
        return mAmountOfVotes;
    }

    public void setAmountOfVotes(Object amountOfVotes) {
        mAmountOfVotes = amountOfVotes;
    }

    public Object getFormattedAmountOfVotes() {
        return mFormattedAmountOfVotes;
    }

    public void setFormattedAmountOfVotes(Object formattedAmountOfVotes) {
        mFormattedAmountOfVotes = formattedAmountOfVotes;
    }

    public Boolean getHighlighted() {
        return mHighlighted;
    }

    public void setHighlighted(Boolean highlighted) {
        mHighlighted = highlighted;
    }

    public String getHref() {
        return mHref;
    }

    public void setHref(String href) {
        mHref = href;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Long getNumericalId() {
        return mNumericalId;
    }

    public void setNumericalId(Long numericalId) {
        mNumericalId = numericalId;
    }

    public Double getScore() {
        return mScore;
    }

    public void setScore(Double score) {
        mScore = score;
    }

    public Site getSite() {
        return mSite;
    }

    public void setSite(Site site) {
        mSite = site;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
