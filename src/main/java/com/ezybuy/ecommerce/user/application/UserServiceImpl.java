package com.ezybuy.ecommerce.user.application;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.ezybuy.ecommerce.user.domain.model.Permission;
import com.ezybuy.ecommerce.user.domain.model.Role;
import com.ezybuy.ecommerce.user.domain.model.RoleEnum;
import com.ezybuy.ecommerce.user.domain.model.User;
import com.ezybuy.ecommerce.user.domain.service.IUserService;
import com.ezybuy.ecommerce.user.infrastructure.mapper.UserMapper;
import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.PermissionEntity;
import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.RoleEntity;
import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.UserEntity;
import com.ezybuy.ecommerce.user.infrastructure.persistence.repository.UserRepositoryImpl;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepositoryImpl userRepositoryImpl;
    private final UserMapper userMapper;

    @Override
    public User createNewUser(User user) {

        Permission createPermission = Permission.builder()
                .name("CREATE")
                .build();

        Role userRole = Role.builder()
                .roleEnum(RoleEnum.ADMIN)
                .permissionList(Set.of(createPermission))
                .build();

        User newUser = User.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .accountNoExpired(true)
                .accountNoLocked(true)
                .isEnabled(true)
                .credentialNoExpired(true)
                .roles(Set.of(userRole))
                .build();

        return userRepositoryImpl.save(userMapper.toEntity(newUser));
    }
}