
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

public class Verdict {

    @SerializedName("localized_name")
    private String mLocalizedName;
    @SerializedName("name")
    private String mName;

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

}
