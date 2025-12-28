package com.ezybuy.ecommerce.user.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ezybuy.ecommerce.user.application.UserServiceImpl;
import com.ezybuy.ecommerce.user.domain.User;
import com.ezybuy.ecommerce.user.infrastructure.dto.UserDto;
import com.ezybuy.ecommerce.user.infrastructure.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserControllerImpl implements IUserController {

    private final UserServiceImpl userServiceImpl;
    private final UserMapper userMapper;

    @PostMapping
    public ResponseEntity<UserDto> createNewUser(User user) {
        User newUser = userServiceImpl.createNewUser(user);
        UserDto userDto = userMapper.userToUserDTO(newUser);
        return ResponseEntity.ok(userDto);
    }

}
