package com.ezybuy.ecommerce.role.infrastructure.persistence.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ezybuy.ecommerce.role.infrastructure.persistence.entity.RoleEntity;
import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.UserEntity;

@Repository
public interface RoleJpaRepository extends JpaRepository<RoleEntity, Long>{
    // Optional<UserEntity> findUserEntityByUsername(String username);
}
