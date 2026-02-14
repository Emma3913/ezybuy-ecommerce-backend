package com.gatekeeper.user.infrastructure.dto;

import lombok.Data;

@Data
public class LoginRequest {
    String username;
    String password;
}
