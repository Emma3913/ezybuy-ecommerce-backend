package com.ezybuy.ecommerce.user.infrastructure.persistence.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.UserEntity;

@Repository
public interface UserJpaRepository extends JpaRepository<UserEntity, Long>{
    Optional<UserEntity> findUserEntityByUsername(String username);
}
