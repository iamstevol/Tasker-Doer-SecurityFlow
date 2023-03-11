package com.example.demo11.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoleEnum {

    TASKER("ROLE_TASKER"), DOER("ROLE_DOER");

    private final String role;
}
