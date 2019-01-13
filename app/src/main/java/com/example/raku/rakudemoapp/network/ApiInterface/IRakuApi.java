package com.example.raku.rakudemoapp.network.ApiInterface;

import com.example.raku.rakudemoapp.models.BaseResponseModal;
import com.example.raku.rakudemoapp.models.home.ListRow;
import com.example.raku.rakudemoapp.models.movies.MovieDetails;
import com.example.raku.rakudemoapp.views.home.MovieViewModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IRakuApi {

    @GET("v3/lists/{id}?classification_id=6&device_identifier=android&locale=es&market_code=es")
    Call<ListRow> getRowData(@Path("id") String id);

    @GET("v3/movies/{id}?classification_id=6&device_identifier=android&locale=es&market_code=es")
    Call<MovieDetails> getDetails(@Path("id") String id);
}
