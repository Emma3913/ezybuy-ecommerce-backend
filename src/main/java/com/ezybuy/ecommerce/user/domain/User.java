package com.ezybuy.ecommerce.user.domain;

import java.util.List;

import javax.management.relation.Role;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;
    // private List<ShoppingCart> shoppingCarts;
}