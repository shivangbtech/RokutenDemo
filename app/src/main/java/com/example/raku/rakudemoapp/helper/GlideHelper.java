package com.example.raku.rakudemoapp.helper;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.raku.rakudemoapp.R;

public class GlideHelper {

    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .setDefaultRequestOptions(new RequestOptions()
                        .placeholder(R.drawable.placeholder)
                        .error(R.drawable.placeholder))
                .load(url)
                //.transition(DrawableTransitionOptions.withCrossFade(1000))//in milliseconds
//                .thumbnail(0.1f)
                //.apply(RequestOptions.circleCropTransform())
                //.apply(new RequestOptions().transform(new RoundedCorners(50)))
                .into(imageView);
    }
}
