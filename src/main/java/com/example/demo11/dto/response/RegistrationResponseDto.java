package com.example.demo11.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class RegistrationResponseDto {

    private String firstName;
    private String lastName;
}
