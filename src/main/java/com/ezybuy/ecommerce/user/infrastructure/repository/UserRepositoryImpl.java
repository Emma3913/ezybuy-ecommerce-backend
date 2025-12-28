package com.ezybuy.ecommerce.user.infrastructure.repository;

import com.ezybuy.ecommerce.user.domain.IUserRepository;
import com.ezybuy.ecommerce.user.domain.User;
import com.ezybuy.ecommerce.user.infrastructure.entity.UserEntity;
import com.ezybuy.ecommerce.user.infrastructure.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryImpl implements IUserRepository {

    private final UserJpaRepository springUserRepository;
    private final UserMapper userMapper;
    
    @Override
    public User save(User user) {
        UserEntity entity = userMapper.userToUserEntity(user);
        UserEntity saved = springUserRepository.save(entity);
        return userMapper.userEntityToUser(saved);
    }
    
    @Override
    public UserEntity findUserEntityByUsername(String username) {
        UserEntity userEntity = springUserRepository.findUserEntityByUsername(username).orElse(null);
        return userEntity;
    }    
}