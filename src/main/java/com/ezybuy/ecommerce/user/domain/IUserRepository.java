package com.ezybuy.ecommerce.user.domain;

import java.util.Optional;

import com.ezybuy.ecommerce.user.infrastructure.entity.UserEntity;

public interface IUserRepository {
    UserEntity save(UserEntity userEntity);
    Optional<UserEntity> findUserEntityByUsername(String username);
    
} 
