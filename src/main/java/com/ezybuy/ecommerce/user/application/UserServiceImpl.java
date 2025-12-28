package com.ezybuy.ecommerce.user.application;

import org.springframework.stereotype.Service;

import com.ezybuy.ecommerce.user.domain.IUserService;
import com.ezybuy.ecommerce.user.domain.User;
import com.ezybuy.ecommerce.user.infrastructure.repository.UserRepositoryImpl;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepositoryImpl userRepositoryImpl;

    @Override
    public User createNewUser(User user) {
        return userRepositoryImpl.save(user);
    }

    
}