package com.example.user.dto.request;

import com.example.user.conts.Authority;
import com.example.user.repository.Member;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class SignupRequestDto {
    private String userId;
    private String password;
    private String email;
    @Enumerated(EnumType.STRING)
    private Authority authority;

    public Member toEntity(){
        return Member.builder()
                .loginId(this.userId)
                .password(this.password)
                .email(this.email)
                .authority(this.authority)
                .build();
    }
}
