
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Meta {

    @SerializedName("already_seens")
    private List<Object> mAlreadySeens;
    @SerializedName("heartbeats")
    private List<Object> mHeartbeats;
    @SerializedName("likes")
    private List<Object> mLikes;
    @SerializedName("pagination")
    private Pagination mPagination;
    @SerializedName("rights")
    private List<Object> mRights;
    @SerializedName("warnings")
    private List<Object> mWarnings;
    @SerializedName("wishlists")
    private List<Object> mWishlists;

    public List<Object> getAlreadySeens() {
        return mAlreadySeens;
    }

    public void setAlreadySeens(List<Object> alreadySeens) {
        mAlreadySeens = alreadySeens;
    }

    public List<Object> getHeartbeats() {
        return mHeartbeats;
    }

    public void setHeartbeats(List<Object> heartbeats) {
        mHeartbeats = heartbeats;
    }

    public List<Object> getLikes() {
        return mLikes;
    }

    public void setLikes(List<Object> likes) {
        mLikes = likes;
    }

    public Pagination getPagination() {
        return mPagination;
    }

    public void setPagination(Pagination pagination) {
        mPagination = pagination;
    }

    public List<Object> getRights() {
        return mRights;
    }

    public void setRights(List<Object> rights) {
        mRights = rights;
    }

    public List<Object> getWarnings() {
        return mWarnings;
    }

    public void setWarnings(List<Object> warnings) {
        mWarnings = warnings;
    }

    public List<Object> getWishlists() {
        return mWishlists;
    }

    public void setWishlists(List<Object> wishlists) {
        mWishlists = wishlists;
    }

}
