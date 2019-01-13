
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Private {

    @SerializedName("offline_streams")
    private List<OfflineStream> mOfflineStreams;
    @SerializedName("streams")
    private List<Stream> mStreams;

    public List<OfflineStream> getOfflineStreams() {
        return mOfflineStreams;
    }

    public void setOfflineStreams(List<OfflineStream> offlineStreams) {
        mOfflineStreams = offlineStreams;
    }

    public List<Stream> getStreams() {
        return mStreams;
    }

    public void setStreams(List<Stream> streams) {
        mStreams = streams;
    }

}
