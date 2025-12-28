package com.ezybuy.ecommerce.user.domain;

import javax.management.relation.Role;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private Long id;
    private String username;
    private String password;
    // private String firstname;
    // private String lastname;
    // private String email;
    // private Role role;
    // private List<ShoppingCart> shoppingCarts;
}