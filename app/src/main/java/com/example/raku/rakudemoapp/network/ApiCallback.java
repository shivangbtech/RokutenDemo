package com.example.raku.rakudemoapp.network;

import com.example.raku.rakudemoapp.models.BaseResponseModal;

public interface ApiCallback<T> {

    void onSuccess(T t);

    void onError(BaseResponseModal responseModal);
}
