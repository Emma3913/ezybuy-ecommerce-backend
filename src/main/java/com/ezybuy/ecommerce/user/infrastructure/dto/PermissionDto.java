package com.ezybuy.ecommerce.user.infrastructure.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PermissionDto {
    private Long id;
    private String name;
}