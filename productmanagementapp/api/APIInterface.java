package com.example.productmanagementapp.api;

import com.example.productmanagementapp.model.UserModelItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    @GET("products")
    Call<List<UserModelItem>> getProductData();
}
