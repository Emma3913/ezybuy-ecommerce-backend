package com.ezybuy.ecommerce.role.infrastructure.dto;

import java.util.Set;

public record CreateRoleRequest(
    String role,
    Set<Long> permissionIds
) {}
