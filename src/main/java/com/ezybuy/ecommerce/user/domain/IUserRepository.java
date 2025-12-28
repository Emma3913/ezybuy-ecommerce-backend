package com.ezybuy.ecommerce.user.domain;

import java.util.Optional;

import com.ezybuy.ecommerce.user.infrastructure.entity.UserEntity;

public interface IUserRepository {
    User save(User userEntity);
    UserEntity findUserEntityByUsername(String username);
} 
