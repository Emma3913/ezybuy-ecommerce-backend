package com.ezybuy.ecommerce.user.domain.port;

import com.ezybuy.ecommerce.user.domain.model.User;
import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.UserEntity;

public interface IUserRepository {
    User save(UserEntity userEntity);
    User findUserEntityByUsername(String username);
} 
