package com.example.user.service;

import com.example.common.component.TokenProvider;
import com.example.common.dto.TokenDto;
import com.example.user.component.CustomAuthenticationProvider;
import com.example.user.dto.request.SigninRequestDto;
import com.example.user.dto.response.UserResponseDto;
import com.example.user.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthService {
    private final TokenProvider tokenProvider;
    private final CustomAuthenticationProvider customAuthenticationProvider;
    private final MemberRepository memberRepository;

    public UserResponseDto signIn(SigninRequestDto signinRequestDto){
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(signinRequestDto.getUserId(), signinRequestDto.getPassword());

        Authentication authentication = customAuthenticationProvider.authenticate(authenticationToken);

        TokenDto tokenDto = tokenProvider.generateTokenDto(authentication);

        //TODO refreshToken

        return UserResponseDto.builder().build();
    }

}
