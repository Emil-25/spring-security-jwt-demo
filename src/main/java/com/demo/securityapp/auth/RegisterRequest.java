package com.demo.securityapp.auth;

import com.demo.securityapp.models.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequest {
    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Role role;
}
