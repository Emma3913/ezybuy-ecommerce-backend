package com.ezybuy.ecommerce.user.infrastructure.mapper;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.ezybuy.ecommerce.user.domain.model.Permission;
import com.ezybuy.ecommerce.user.domain.model.Role;
import com.ezybuy.ecommerce.user.domain.model.User;
import com.ezybuy.ecommerce.user.infrastructure.dto.PermissionDto;
import com.ezybuy.ecommerce.user.infrastructure.dto.RoleDto;
import com.ezybuy.ecommerce.user.infrastructure.dto.UserDto;
import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.PermissionEntity;
import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.RoleEntity;
import com.ezybuy.ecommerce.user.infrastructure.persistence.entity.UserEntity;

@Component
public class UserMapper {
    public UserEntity toEntity(User user) {
        if (user == null) return null;

        return UserEntity.builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .isEnabled(user.getIsEnabled())
                .accountNoExpired(user.getAccountNoExpired())
                .accountNoLocked(user.getAccountNoLocked())
                .credentialNoExpired(user.getCredentialNoExpired())
                .roles(toRoleEntitySet(user.getRoles()))
                .build();
    }

    public User toDomain(UserEntity entity) {
        if (entity == null) return null;

        return User.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .password(entity.getPassword())
                .isEnabled(entity.getIsEnabled())
                .accountNoExpired(entity.getAccountNoExpired())
                .accountNoLocked(entity.getAccountNoLocked())
                .credentialNoExpired(entity.getCredentialNoExpired())
                .roles(toRoleDomainSet(entity.getRoles()))
                .build();
    }

    public UserDto toDto(User user) {
        if (user == null) return null;

        return UserDto.builder()
                .id(user.getId())
                .username(user.getUsername())
                .roles(toRoleDtoSet(user.getRoles()))
                .build();
    }

    private Set<RoleEntity> toRoleEntitySet(Set<Role> roles) {
        if (roles == null) return Set.of();

        return roles.stream()
                .map(role -> RoleEntity.builder()
                        .id(role.getId())
                        .roleEnum(role.getRoleEnum())
                        .permissionList(toPermissionEntitySet(role.getPermissionList()))
                        .build()
                )
                .collect(Collectors.toSet());
    }

    private Set<Role> toRoleDomainSet(Set<RoleEntity> entities) {
        if (entities == null) return Set.of();

        return entities.stream()
                .map(entity -> Role.builder()
                        .id(entity.getId())
                        .roleEnum(entity.getRoleEnum())
                        .permissionList(toPermissionDomainSet(entity.getPermissionList()))
                        .build()
                )
                .collect(Collectors.toSet());
    }

    private Set<RoleDto> toRoleDtoSet(Set<Role> roles) {
        if (roles == null) return Set.of();

        return roles.stream()
                .map(role -> RoleDto.builder()
                        .id(role.getId())
                        .roleEnum(role.getRoleEnum())
                        .permissions(toPermissionDtoSet(role.getPermissionList()))
                        .build()
                )
                .collect(Collectors.toSet());
    }

    private Set<PermissionEntity> toPermissionEntitySet(Set<Permission> permissions) {
        if (permissions == null) return Set.of();

        return permissions.stream()
                .map(permission -> PermissionEntity.builder()
                        .id(permission.getId())
                        .name(permission.getName())
                        .build()
                )
                .collect(Collectors.toSet());
    }

    private Set<Permission> toPermissionDomainSet(Set<PermissionEntity> entities) {
        if (entities == null) return Set.of();

        return entities.stream()
                .map(entity -> Permission.builder()
                        .id(entity.getId())
                        .name(entity.getName())
                        .build()
                )
                .collect(Collectors.toSet());
    }

    private Set<PermissionDto> toPermissionDtoSet(Set<Permission> permissions) {
        if (permissions == null) return Set.of();

        return permissions.stream()
                .map(permission -> PermissionDto.builder()
                        .id(permission.getId())
                        .name(permission.getName())
                        .build()
                )
                .collect(Collectors.toSet());
    }
}
