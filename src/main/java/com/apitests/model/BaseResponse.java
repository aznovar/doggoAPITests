package com.apitests.model;

import lombok.Data;

@Data
public class BaseResponse {
    private String message;
    private int success;
}
