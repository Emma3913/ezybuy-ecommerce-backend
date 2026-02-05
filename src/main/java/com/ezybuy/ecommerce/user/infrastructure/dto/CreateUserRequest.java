package com.ezybuy.ecommerce.user.infrastructure.dto;

public record CreateUserRequest(
    String username,
    String password
) {}
