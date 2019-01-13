
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Trailer {

    @SerializedName("audio_languages")
    private List<AudioLanguage> mAudioLanguages;
    @SerializedName("audio_qualities")
    private List<AudioQuality> mAudioQualities;
    @SerializedName("hdr_types")
    private List<HdrType> mHdrTypes;
    @SerializedName("streaming_drm_types")
    private List<StreamingDrmType> mStreamingDrmTypes;
    @SerializedName("subtitle_languages")
    private List<SubtitleLanguage> mSubtitleLanguages;
    @SerializedName("video_qualities")
    private List<VideoQuality> mVideoQualities;

    public List<AudioLanguage> getAudioLanguages() {
        return mAudioLanguages;
    }

    public void setAudioLanguages(List<AudioLanguage> audioLanguages) {
        mAudioLanguages = audioLanguages;
    }

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

    public List<StreamingDrmType> getStreamingDrmTypes() {
        return mStreamingDrmTypes;
    }

    public void setStreamingDrmTypes(List<StreamingDrmType> streamingDrmTypes) {
        mStreamingDrmTypes = streamingDrmTypes;
    }

    public List<SubtitleLanguage> getSubtitleLanguages() {
        return mSubtitleLanguages;
    }

    public void setSubtitleLanguages(List<SubtitleLanguage> subtitleLanguages) {
        mSubtitleLanguages = subtitleLanguages;
    }

    public List<VideoQuality> getVideoQualities() {
        return mVideoQualities;
    }

    public void setVideoQualities(List<VideoQuality> videoQualities) {
        mVideoQualities = videoQualities;
    }

}
