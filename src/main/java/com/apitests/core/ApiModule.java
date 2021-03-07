package com.apitests.core;

import com.apitests.remote.auth.AuthRequests;
import com.apitests.remote.auth.AuthRequestsImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class ApiModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(AuthRequests.class).to(AuthRequestsImpl.class);
        bind(ApiService.class).toProvider(ServiceFactory.class);
    }
}
