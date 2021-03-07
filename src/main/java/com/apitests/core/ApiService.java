package com.apitests.core;

import com.apitests.model.BaseResponse;
import com.apitests.model.auth.RegistrationModel;
import retrofit2.Call;
import retrofit2.http.*;


public interface ApiService {

    String REGISTRATION_ENDPOINT = "registration";

    @Headers("Content-Type: application/json")
    @POST(REGISTRATION_ENDPOINT)
    Call<BaseResponse> register(@Body RegistrationModel registrationModel);

}
