package com.ezybuy.ecommerce.role.infrastructure.dto;

import lombok.Builder;

import java.util.Set;

import com.ezybuy.ecommerce.permission.infrastructure.dto.PermissionDto;
import com.ezybuy.ecommerce.role.domain.model.RoleEnum;

@Builder
public record RoleDto(Long id,
        RoleEnum roleEnum,
        Set<PermissionDto> permissions) {
}
