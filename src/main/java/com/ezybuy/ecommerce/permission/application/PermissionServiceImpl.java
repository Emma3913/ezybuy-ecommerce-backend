package com.ezybuy.ecommerce.permission.application;

import org.springframework.stereotype.Service;

import com.ezybuy.ecommerce.permission.domain.model.Permission;
import com.ezybuy.ecommerce.permission.domain.service.IPermissionService;
import com.ezybuy.ecommerce.permission.infrastructure.mapper.PermissionMapper;
import com.ezybuy.ecommerce.permission.infrastructure.persistence.repository.PermissionRepositoryImpl;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements IPermissionService {

    private final PermissionRepositoryImpl permissionRepositoryImpl;
    private final PermissionMapper permissionMapper;

    @Override
    public Permission createNewPermission(Permission permission) {
        Permission newPermission = Permission.builder()
                .name(permission.getName())
                .build();
        return permissionRepositoryImpl.save(permissionMapper.toEntity(newPermission));
    }
}
