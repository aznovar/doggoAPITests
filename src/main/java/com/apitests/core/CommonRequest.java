package com.apitests.core;

import lombok.extern.slf4j.Slf4j;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

@Slf4j
public class CommonRequest {

    public void make(Call call){
        execute(call);
    }

    private void execute(Call call){
        try{
            Response response = call.execute();
            if(response.isSuccessful() && response.body() != null){
                response.body();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
