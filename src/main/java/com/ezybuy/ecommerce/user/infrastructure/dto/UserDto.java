package com.ezybuy.ecommerce.user.infrastructure.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

import com.ezybuy.ecommerce.role.infrastructure.dto.RoleDto;

@Builder
public record UserDto(Long id,
    String username,
    Set<RoleDto> roles) {}
    