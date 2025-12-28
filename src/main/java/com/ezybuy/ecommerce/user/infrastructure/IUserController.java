package com.ezybuy.ecommerce.user.infrastructure;

import org.springframework.http.ResponseEntity;

import com.ezybuy.ecommerce.user.domain.User;
import com.ezybuy.ecommerce.user.infrastructure.dto.UserDto;

public interface IUserController {
    ResponseEntity<UserDto> createNewUser(User user);
}
