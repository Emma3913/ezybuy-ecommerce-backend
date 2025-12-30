package com.ezybuy.ecommerce.user.infrastructure.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

import com.ezybuy.ecommerce.user.domain.model.RoleEnum;

@Data
@Builder
public class RoleDto {
    private Long id;
    private RoleEnum roleEnum;
    private Set<PermissionDto> permissions;
}
