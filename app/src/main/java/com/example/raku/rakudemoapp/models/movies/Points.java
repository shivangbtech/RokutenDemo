
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

public class Points {

    @SerializedName("cost")
    private Long mCost;
    @SerializedName("reward")
    private Long mReward;

    public Long getCost() {
        return mCost;
    }

    public void setCost(Long cost) {
        mCost = cost;
    }

    public Long getReward() {
        return mReward;
    }

    public void setReward(Long reward) {
        mReward = reward;
    }

}
