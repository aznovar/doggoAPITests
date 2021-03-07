package com.apitests.remote.auth;

public interface AuthRequests<T> {

    void register(T t);

    void login(String username, String password);
}
