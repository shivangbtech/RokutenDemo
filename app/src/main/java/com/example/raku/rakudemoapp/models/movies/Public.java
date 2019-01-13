
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Public {

    @SerializedName("adverts")
    private List<Object> mAdverts;
    @SerializedName("previews")
    private List<Object> mPreviews;
    @SerializedName("trailers")
    private List<Trailer> mTrailers;

    public List<Object> getAdverts() {
        return mAdverts;
    }

    public void setAdverts(List<Object> adverts) {
        mAdverts = adverts;
    }

    public List<Object> getPreviews() {
        return mPreviews;
    }

    public void setPreviews(List<Object> previews) {
        mPreviews = previews;
    }

    public List<Trailer> getTrailers() {
        return mTrailers;
    }

    public void setTrailers(List<Trailer> trailers) {
        mTrailers = trailers;
    }

}
