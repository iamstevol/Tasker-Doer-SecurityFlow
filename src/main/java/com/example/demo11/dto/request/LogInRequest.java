package com.example.demo11.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class LogInRequest {

    private String email;

    private String password;
}
