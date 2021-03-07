package com.apitests.model;

import lombok.Data;

@Data
public class ApiError {

    private int statusCode;
    private String message;
}
