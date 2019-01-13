package com.example.raku.rakudemoapp.network;


import com.example.raku.rakudemoapp.network.ApiInterface.IRakuApi;
import retrofit2.Retrofit;

public class DataServiceFactory {

    private static DataServiceFactory sDataService;
    private Retrofit mRestClient;

    private DataServiceFactory(Retrofit restClient) {
        mRestClient = restClient;
    }

    public static DataServiceFactory getInstance() {
        if (sDataService == null) {
            sDataService = new DataServiceFactory(ApiClient.getInstance().getClient());
        }
        return sDataService;
    }

    public IRakuApi getRakuApi() {
        return mRestClient.create(IRakuApi.class);
    }
}


