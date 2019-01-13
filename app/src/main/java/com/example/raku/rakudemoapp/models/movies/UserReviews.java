
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserReviews {

    @SerializedName("data")
    private List<Datum> mData;
    @SerializedName("meta")
    private Meta mMeta;

    public List<Datum> getData() {
        return mData;
    }

    public void setData(List<Datum> data) {
        mData = data;
    }

    public Meta getMeta() {
        return mMeta;
    }

    public void setMeta(Meta meta) {
        mMeta = meta;
    }

}
