
package com.example.raku.rakudemoapp.models.movies;

import com.google.gson.annotations.SerializedName;

public class ViewOptions {

    @SerializedName("private")
    private Private mPrivate;
    @SerializedName("public")
    private Public mPublic;
    @SerializedName("support")
    private Support mSupport;

    public Private getPrivate() {
        return mPrivate;
    }

    public Public getPublic() {
        return mPublic;
    }

    public Support getSupport() {
        return mSupport;
    }

    public void setSupport(Support support) {
        mSupport = support;
    }

}
