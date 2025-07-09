package com.uca.parcialfinalncapas.controller;

import com.uca.parcialfinalncapas.dto.loginregister.AuthRequest;
import com.uca.parcialfinalncapas.dto.loginregister.AuthResponse;
import com.uca.parcialfinalncapas.entities.User;
import com.uca.parcialfinalncapas.service.impl.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        return authService.login(request);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return authService.register(user);
    }
}


