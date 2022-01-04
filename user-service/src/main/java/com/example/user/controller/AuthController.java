package com.example.user.controller;

import com.example.user.dto.request.SigninRequestDto;
import com.example.user.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity getUser(@RequestBody SigninRequestDto loginRequestDto){
        return ResponseEntity.ok(authService.signIn(loginRequestDto));
    }

    @PostMapping("/token")
    public ResponseEntity getToken(){
        return ResponseEntity.ok("success");
    }

    @PostMapping("/refreshToken")
    public ResponseEntity getRefreshToken(){
        return ResponseEntity.ok("success");
    }
}
