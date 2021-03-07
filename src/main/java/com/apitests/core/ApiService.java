package com.apitests.core;

import com.apitests.model.BaseResponse;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.Map;

public interface ApiService {

    String REGISTRATION_ENDPOINT = "registration";

    @FormUrlEncoded
    @Headers("Content-Type: application/json")
    @POST(REGISTRATION_ENDPOINT)
    Call<BaseResponse> register(@FieldMap Map<String, String> params);

}
