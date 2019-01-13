
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Support {

    @SerializedName("audio_qualities")
    private List<AudioQuality> mAudioQualities;
    @SerializedName("hdr_types")
    private List<HdrType> mHdrTypes;
    @SerializedName("video_qualities")
    private List<VideoQuality> mVideoQualities;

    public List<AudioQuality> getAudioQualities() {
        return mAudioQualities;
    }

    public void setAudioQualities(List<AudioQuality> audioQualities) {
        mAudioQualities = audioQualities;
    }

    public List<HdrType> getHdrTypes() {
        return mHdrTypes;
    }

    public void setHdrTypes(List<HdrType> hdrTypes) {
        mHdrTypes = hdrTypes;
    }

    public List<VideoQuality> getVideoQualities() {
        return mVideoQualities;
    }

    public void setVideoQualities(List<VideoQuality> videoQualities) {
        mVideoQualities = videoQualities;
    }

}
