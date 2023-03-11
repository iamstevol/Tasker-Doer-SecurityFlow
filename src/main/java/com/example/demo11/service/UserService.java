package com.example.demo11.service;

import com.example.demo11.dto.request.UserRegistrationRequestDto;
import com.example.demo11.dto.response.RegistrationResponseDto;

public interface UserService {
    RegistrationResponseDto registerUser(UserRegistrationRequestDto registrationRequestDto);
}
