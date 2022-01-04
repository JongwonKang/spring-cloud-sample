package com.example.user.service;

import com.example.user.dto.request.SigninRequestDto;
import com.example.user.dto.response.UserResponseDto;
import com.example.user.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthService {
    private final MemberRepository memberRepository;

    public UserResponseDto signIn(SigninRequestDto signinRequestDto){
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(signinRequestDto.getUserId(), signinRequestDto.getPassword());

        return null;
    }

}
