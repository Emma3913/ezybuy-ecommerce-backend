package com.ezybuy.ecommerce.role.domain.port;

import com.ezybuy.ecommerce.role.domain.model.Role;
import com.ezybuy.ecommerce.role.infrastructure.persistence.entity.RoleEntity;

public interface IRoleRepository {
    Role save(RoleEntity roleEntity);
} 
