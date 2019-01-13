
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("average")
    private Double mAverage;
    @SerializedName("scale")
    private Long mScale;

    public Double getAverage() {
        return mAverage;
    }

    public void setAverage(Double average) {
        mAverage = average;
    }

    public Long getScale() {
        return mScale;
    }

    public void setScale(Long scale) {
        mScale = scale;
    }

}
