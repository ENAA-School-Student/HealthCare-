package org.example.healthcare.dto.auth;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.healthcare.model.Utilisateur;


@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String email;
    private Utilisateur.Role role;
}
