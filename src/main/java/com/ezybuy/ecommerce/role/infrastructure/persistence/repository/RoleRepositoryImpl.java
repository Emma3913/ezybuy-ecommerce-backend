package com.ezybuy.ecommerce.role.infrastructure.persistence.repository;

import org.springframework.stereotype.Component;

import com.ezybuy.ecommerce.role.domain.model.Role;
import com.ezybuy.ecommerce.role.domain.port.IRoleRepository;
import com.ezybuy.ecommerce.role.infrastructure.mapper.RoleMapper;
import com.ezybuy.ecommerce.role.infrastructure.persistence.entity.RoleEntity;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class RoleRepositoryImpl implements IRoleRepository {

    private final RoleJpaRepository userJpaRepository;
    private final RoleMapper roleMapper;

    @Override
    public Role save(RoleEntity roleEntity) {
        RoleEntity saved = userJpaRepository.save(roleEntity);
        return roleMapper.toRole(saved);
    }
}
