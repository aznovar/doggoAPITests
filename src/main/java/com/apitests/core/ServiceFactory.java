package com.apitests.core;

import com.google.gson.Gson;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

@Singleton
public class ServiceFactory implements Provider<ApiService> {

    private String SERVER_URL = "http://192.168.0.13:8081";
    private String BASE_URL = SERVER_URL + "/api/v1/";


    @Override
    public ApiService get() {
        OkHttpClient okHttpClient = makeOkHttpClient(makeHttpLoggingInterceptor(true));
        return makeService(okHttpClient, new Gson());
    }

    private ApiService makeService(OkHttpClient okHttpClient, Gson gson) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(ApiService.class);
    }

    private OkHttpClient makeOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor) {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        return httpClient
                .addInterceptor(httpLoggingInterceptor)
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .build();
    }

    private HttpLoggingInterceptor makeHttpLoggingInterceptor(Boolean isDebug) {
        HttpLoggingInterceptor httpLoggingInterceptors = new HttpLoggingInterceptor();
        if (isDebug) {
            httpLoggingInterceptors.level(HttpLoggingInterceptor.Level.BODY);
        } else
            httpLoggingInterceptors.level(HttpLoggingInterceptor.Level.NONE);

        return httpLoggingInterceptors;
    }

}
