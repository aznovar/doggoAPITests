package com.apitests.remote.auth;

import com.apitests.core.ApiService;
import com.apitests.core.CommonRequest;
import com.google.inject.Inject;

import java.util.HashMap;
import java.util.Map;

public class AuthRequestsImpl implements AuthRequests {

    private final ApiService apiService;

    private final CommonRequest commonRequest;

    @Inject
    public AuthRequestsImpl(ApiService apiService, CommonRequest commonRequest){
        this.apiService = apiService;
        this.commonRequest = commonRequest;
    }

    @Override
    public void register(String username, String password) {
        commonRequest.make(apiService.register(collectMapForRegisterRequest(username,password)));
    }

    @Override
    public void login(String username, String password) {

    }

    private Map<String, String> collectMapForRegisterRequest(String username, String password){
        Map<String,String> requestMap = new HashMap<>();
        requestMap.put("username",username);
        requestMap.put("password", password);
        return requestMap;
    }
}
