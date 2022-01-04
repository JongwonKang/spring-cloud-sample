package com.example.user.dto.request;

import com.example.user.conts.Authority;
import com.example.user.repository.User;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class LoginRequestDto {
    private String userId;
    private String password;
    private String email;
    @Enumerated(EnumType.STRING)
    private Authority authority;

    public User toEntity(){
        return User.builder()
                .loginId(this.userId)
                .password(this.password)
                .email(this.email)
                .authority(this.authority)
                .build();
    }
}
