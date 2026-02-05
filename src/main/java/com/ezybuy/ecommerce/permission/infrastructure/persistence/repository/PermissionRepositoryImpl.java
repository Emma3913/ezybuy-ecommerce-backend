package com.ezybuy.ecommerce.permission.infrastructure.persistence.repository;

import org.springframework.stereotype.Component;

import com.ezybuy.ecommerce.permission.domain.model.Permission;
import com.ezybuy.ecommerce.permission.domain.port.IPermissionRepository;
import com.ezybuy.ecommerce.permission.infrastructure.mapper.PermissionMapper;
import com.ezybuy.ecommerce.permission.infrastructure.persistence.entity.PermissionEntity;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PermissionRepositoryImpl implements IPermissionRepository {

    private final PermissionJpaRepository permissionJpaRepository;
    private final PermissionMapper permissionMapper;

    @Override
    public Permission save(PermissionEntity permissionEntity) {
        PermissionEntity saved = permissionJpaRepository.save(permissionEntity);
        return permissionMapper.toPermission(saved);
    }
}
