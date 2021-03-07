package com.apitests.core;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Singleton
public class ServiceFactory implements Provider<ApiService> {

    private String SERVER_URL = "http://192.168.0.13:8081";
    private String BASE_URL = SERVER_URL + "/api/v1/";


    @Override
    public ApiService get(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ApiService.class);
    }

}
