package com.ezybuy.ecommerce.user.domain.model;

import java.util.Set;

import com.ezybuy.ecommerce.role.domain.model.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;
    private Boolean isEnabled;
    private Boolean accountNoExpired;
    private Boolean accountNoLocked;
    private Boolean credentialNoExpired;
    private Set<Role> roles;
}