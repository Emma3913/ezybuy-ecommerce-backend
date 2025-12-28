package com.ezybuy.ecommerce.user.infrastructure.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezybuy.ecommerce.user.infrastructure.entity.UserEntity;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long>{
    Optional<UserEntity> findUserEntityByUsername(String username);
    
}
