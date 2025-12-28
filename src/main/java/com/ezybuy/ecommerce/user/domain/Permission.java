package com.ezybuy.ecommerce.user.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Permission {
    private Long id;
    private String name;
}
