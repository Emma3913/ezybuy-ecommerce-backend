package com.ezybuy.ecommerce.permission.infrastructure.persistence.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ezybuy.ecommerce.permission.infrastructure.persistence.entity.PermissionEntity;
import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.UserEntity;

@Repository
public interface PermissionJpaRepository extends JpaRepository<PermissionEntity, Long>{
    // Optional<UserEntity> findUserEntityByUsername(String username);
}
