package com.example.springboot.entity;

import lombok.Data;

@Data
public class ErrorResponse {
    private String code;
    private String message;
}
