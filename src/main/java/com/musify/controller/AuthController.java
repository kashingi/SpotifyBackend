package com.musify.controller;

import com.musify.dto.request.ForgotPasswordRequest;
import com.musify.dto.request.LoginUserRequest;
import com.musify.dto.request.RefreshTokenRequest;
import com.musify.dto.request.RegisterUserRequest;
import com.musify.dto.response.AppUserResponse;
import com.musify.dto.response.MessageResponse;
import com.musify.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Add your annotations here
@RestController
@RequestMapping(path = "/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping(path = "/registerUser")
    public ResponseEntity<MessageResponse> registerUser(@Valid @RequestBody RegisterUserRequest request) {
        MessageResponse response = authService.registerUser(request);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping(path = "/loginUser")
    public ResponseEntity<AppUserResponse> loginUser(@Valid @RequestBody LoginUserRequest request) {
        AppUserResponse response = authService.loginUser(request);

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/refreshAccessToken")
    public ResponseEntity<AppUserResponse> refreshAccessToken(@Valid @RequestBody RefreshTokenRequest request) {
        AppUserResponse response = authService.refreshAccessToken(request);

        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/forgotPassword")
    public ResponseEntity<MessageResponse> forgotPassword(@Valid @RequestBody ForgotPasswordRequest request) {
        MessageResponse response = authService.forgotPassword(request);

        return ResponseEntity.ok(response);
    }
}
