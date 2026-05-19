package org.example.healthcare.controller;

import lombok.RequiredArgsConstructor;
import org.example.healthcare.dto.auth.AuthRequest;
import org.example.healthcare.dto.auth.AuthResponse;
import org.example.healthcare.dto.auth.RegisterRequest;
import org.example.healthcare.service.auth.AuthService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public AuthResponse register(
            @RequestBody RegisterRequest registerRequest
    ) {
        return new AuthResponse(
                service.register(registerRequest)
        );
    }


    @PostMapping("/login")
    public AuthResponse login(
            @RequestBody AuthRequest authRequest
    ) {
        return new AuthResponse(
                service.authenticate(authRequest)
        );
    }
}
