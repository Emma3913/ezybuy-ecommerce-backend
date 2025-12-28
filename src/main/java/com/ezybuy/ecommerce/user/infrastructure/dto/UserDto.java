package com.ezybuy.ecommerce.user.infrastructure.dto;

import com.ezybuy.ecommerce.user.domain.Role;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Long id;
    private String firstname;
    private String lastname;
    @Enumerated(EnumType.STRING)
    private Role role;

}
