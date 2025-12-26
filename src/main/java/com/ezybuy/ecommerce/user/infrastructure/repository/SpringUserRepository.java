package com.ezybuy.ecommerce.user.infrastructure.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ezybuy.ecommerce.user.infrastructure.entity.UserEntity;

public interface SpringUserRepository extends JpaRepository<UserEntity, Long>{
    
}
