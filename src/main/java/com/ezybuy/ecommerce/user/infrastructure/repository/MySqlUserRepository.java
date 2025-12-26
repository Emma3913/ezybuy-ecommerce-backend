package com.ezybuy.ecommerce.user.infrastructure.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ezybuy.ecommerce.user.domain.IUserRepository;
import com.ezybuy.ecommerce.user.domain.User;
import com.ezybuy.ecommerce.user.infrastructure.entity.UserEntity;
import com.ezybuy.ecommerce.user.infrastructure.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MySqlUserRepository implements IUserRepository {

    private final SpringUserRepository springUserRepository;
    private final UserMapper userMapper;
    
    @Override
    public UserEntity save(UserEntity userEntity) {
        UserEntity entity = userMapper.userToUserEntity(userEntity);
        UserEntity saved = springUserRepository.save(entity);
        return userMapper.userEntityToUser(saved);
    }
    
    @Override
    public Optional<UserEntity> findUserEntityByUsername(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUserEntityByUsername'");
    }


    
}