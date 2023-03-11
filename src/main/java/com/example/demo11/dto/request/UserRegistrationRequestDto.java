package com.example.demo11.dto.request;

import com.example.demo11.constant.RoleEnum;
import com.example.demo11.utils.PhoneNumber;
import com.example.demo11.utils.ValidPassword;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown=true)
public class UserRegistrationRequestDto {

    @NotBlank(message = "firstName cannot be empty")
    @Pattern(regexp = "[a-zA-Z]*", message = "FirstName can only have letters")
    @Size(message = "FirstName character length cannot be less than 2 and more than 100", min = 2, max = 100)
    private String firstName;

    @NotBlank(message = "Lastname cannot be empty")
    @Pattern(regexp = "[a-zA-Z]*", message = "lastName can only have letters")
    @Size(message = "Lastname character length cannot be less than 2 and more than 100", min = 2, max = 100)
    private String lastName;

    @NotBlank(message = "email cannot be empty")
    @Email(message = "Must be a valid email!")
    private String email;

    @ValidPassword
    private String password;

    //Interface Annotation and Validator to create custom Annotation
    @ValidPassword
    private String confirmPassword;

    @PhoneNumber
    @NotBlank(message = "phoneNumber cannot be empty")
    @Size(message = "Phone number character length cannot be less than 10 and more than 16", min = 10, max = 16)
    private String phoneNumber;

    private RoleEnum role;

}
