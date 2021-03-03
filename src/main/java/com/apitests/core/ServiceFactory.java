package com.apitests.core;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceFactory {

    private String SERVER_URL = "http://192.168.0.13:8081";
    private String BASE_URL = SERVER_URL + "/api/v1/";


    private ApiService makeService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ApiService.class);
    }

}
