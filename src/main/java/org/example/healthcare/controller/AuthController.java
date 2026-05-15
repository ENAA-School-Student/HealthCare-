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
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest registerRequest){
     String token =  service.register(registerRequest);
        return new AuthResponse(token);
    }


    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest authRequest){
        String token = service.authenticate(authRequest);
        return new AuthResponse(token);
    }
}
