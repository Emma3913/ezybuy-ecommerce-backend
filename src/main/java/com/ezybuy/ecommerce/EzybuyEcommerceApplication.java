package com.ezybuy.ecommerce;

import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ezybuy.ecommerce.user.domain.model.RoleEnum;
import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.PermissionEntity;
import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.RoleEntity;
import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.UserEntity;
import com.ezybuy.ecommerce.user.infrastructure.persistence.repository.UserRepositoryImpl;

@SpringBootApplication
public class EzybuyEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EzybuyEcommerceApplication.class, args);
	}
}
