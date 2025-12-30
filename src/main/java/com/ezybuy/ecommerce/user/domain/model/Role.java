package com.ezybuy.ecommerce.user.domain.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Role {
    private Long id;
    private RoleEnum roleEnum;
    private Set<Permission> permissionList = new HashSet<>();
}
