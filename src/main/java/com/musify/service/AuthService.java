package com.musify.service;

import com.musify.dto.request.ForgotPasswordRequest;
import com.musify.dto.request.LoginUserRequest;
import com.musify.dto.request.RefreshTokenRequest;
import com.musify.dto.request.RegisterUserRequest;
import com.musify.dto.response.AppUserResponse;
import com.musify.dto.response.MessageResponse;
import jakarta.validation.Valid;

//Add your annotations here
public interface AuthService {

    MessageResponse registerUser(RegisterUserRequest request);

    AppUserResponse loginUser(LoginUserRequest request);

    AppUserResponse refreshAccessToken(RefreshTokenRequest request);

    MessageResponse forgotPassword(ForgotPasswordRequest request);
}
