package com.example.user.controller;

import com.example.user.dto.request.SignupRequestDto;
import com.example.user.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final MemberService userService;

    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable Long id){
        return ResponseEntity.ok(userService.getUser(id));
    }

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody SignupRequestDto signupRequestDto){
        return ResponseEntity.ok().body(userService.signup(signupRequestDto));
    }

}
