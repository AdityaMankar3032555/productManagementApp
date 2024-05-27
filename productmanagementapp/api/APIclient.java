package com.example.productmanagementapp.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIclient {
    private static APIclient instance;
    private Retrofit retrofit;
    private static final String BASEURL = "https://dummyjson.com/";

    private APIclient (){
        OkHttpClient httpClient = new OkHttpClient.Builder().build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();
    }

    public static synchronized APIclient getInstance(){
        if(instance == null){
            instance = new APIclient();
        }
        return instance;
    }

    public APIInterface getApi(){
        return retrofit.create(APIInterface.class);
    }
}
