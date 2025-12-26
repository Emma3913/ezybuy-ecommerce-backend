package com.ezybuy.ecommerce.user.infrastructure.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.ezybuy.ecommerce.user.domain.User;
import com.ezybuy.ecommerce.user.infrastructure.entity.UserEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    User userEntityToUser(UserEntity userEntity);
    UserEntity userToUserEntity(User user);
}
