package com.ezybuy.ecommerce.role.application;

import org.springframework.stereotype.Service;

import com.ezybuy.ecommerce.role.domain.model.Role;
import com.ezybuy.ecommerce.role.domain.model.RoleEnum;
import com.ezybuy.ecommerce.role.domain.service.IRoleService;
import com.ezybuy.ecommerce.role.infrastructure.mapper.RoleMapper;
import com.ezybuy.ecommerce.role.infrastructure.persistence.repository.RoleRepositoryImpl;
import com.ezybuy.ecommerce.user.infrastructure.mapper.UserMapper;
import com.ezybuy.ecommerce.user.infrastructure.persistence.repository.UserRepositoryImpl;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements IRoleService {

    private final RoleRepositoryImpl roleRepositoryImpl;
    private final RoleMapper roleMapper;

    @Override
    public Role createNewRole(Role role) {
         Role newRole = Role.builder()
                .roleEnum(role.getRoleEnum())
                .permissionList(role.getPermissionList())
                .build();

                return roleRepositoryImpl.save(roleMapper.toEntity(newRole));
    }
}
