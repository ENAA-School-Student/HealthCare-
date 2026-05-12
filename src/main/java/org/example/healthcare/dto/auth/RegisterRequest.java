package org.example.healthcare.dto.auth;

import lombok.Data;
import org.example.healthcare.model.Utilisateur;


@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String email;
    private Utilisateur.Role role;
}
