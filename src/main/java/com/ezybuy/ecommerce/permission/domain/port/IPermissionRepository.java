package com.ezybuy.ecommerce.permission.domain.port;


import com.ezybuy.ecommerce.permission.domain.model.Permission;
import com.ezybuy.ecommerce.permission.infrastructure.persistence.entity.PermissionEntity;

public interface IPermissionRepository {
    Permission save(PermissionEntity permissionEntity);
} 
