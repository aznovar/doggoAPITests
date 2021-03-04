package com.apitests.core;

import com.apitests.model.BaseResponse;
import com.apitests.model.auth.RegistrationModel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.Map;

public interface ApiService {

    final String REGISTRATION_ENDPOINT = "registration";

    @Headers("Content-Type: application/json")
    @POST(REGISTRATION_ENDPOINT)
    Call<BaseResponse> register(@FieldMap Map<String, String> params);

}
