package com.example.user.controller;

import com.example.user.dto.request.LoginRequestDto;
import com.example.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable Long id){
        return ResponseEntity.ok(userService.getUser(id));
    }

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody LoginRequestDto loginRequestDto){
        return ResponseEntity.ok().body(userService.signup(loginRequestDto));
    }

}
