
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Images {

    @SerializedName("artwork")
    private String mArtwork;
    @SerializedName("ribbons")
    private List<Ribbon> mRibbons;
    @SerializedName("snapshot")
    private String mSnapshot;

    public String getArtwork() {
        return mArtwork;
    }

    public void setArtwork(String artwork) {
        mArtwork = artwork;
    }

    public List<Ribbon> getRibbons() {
        return mRibbons;
    }

    public void setRibbons(List<Ribbon> ribbons) {
        mRibbons = ribbons;
    }

    public String getSnapshot() {
        return mSnapshot;
    }

    public void setSnapshot(String snapshot) {
        mSnapshot = snapshot;
    }

}
