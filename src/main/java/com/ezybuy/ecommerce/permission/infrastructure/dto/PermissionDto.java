package com.ezybuy.ecommerce.permission.infrastructure.dto;

import lombok.Builder;
@Builder
public record PermissionDto(
    Long id,
    String name
) {}