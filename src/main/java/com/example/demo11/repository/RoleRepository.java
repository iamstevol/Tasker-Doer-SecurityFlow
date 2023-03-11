package com.example.demo11.repository;

import com.example.demo11.constant.RoleEnum;
import com.example.demo11.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findRoleByName(RoleEnum roleEnum);
}
