package com.example.user.controller;

import com.example.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;

    @PostMapping("/{id}")
    public ResponseEntity getUser(@PathVariable Long id){
        return ResponseEntity.ok(userService.getUser(id));
    }

    @PostMapping("/regUser")
    public ResponseEntity regUser(){
        return ResponseEntity.ok("success");
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
