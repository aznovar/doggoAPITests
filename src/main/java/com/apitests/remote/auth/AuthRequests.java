package com.apitests.remote.auth;

public interface AuthRequests {

    void register(String username, String password);

    void login(String username, String password);
}
