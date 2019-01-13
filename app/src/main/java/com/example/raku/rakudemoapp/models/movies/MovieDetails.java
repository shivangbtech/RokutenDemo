
package com.example.raku.rakudemoapp.models.movies;

import com.example.raku.rakudemoapp.models.BaseResponseModal;
import com.google.gson.annotations.SerializedName;

public class MovieDetails extends BaseResponseModal {

    @SerializedName("data")
    private Data mData;
    @SerializedName("meta")
    private Meta mMeta;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

    public Meta getMeta() {
        return mMeta;
    }

    public void setMeta(Meta meta) {
        mMeta = meta;
    }

}
