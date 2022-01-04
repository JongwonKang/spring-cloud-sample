package com.example.user.service;

import com.example.user.dto.request.SignupRequestDto;
import com.example.user.dto.response.SignupResponseDto;
import com.example.user.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional(readOnly = true)
    public Long getUser(Long id){
        return id;
    }

    @Transactional
    public SignupResponseDto signup(SignupRequestDto signupRequestDto){
        return SignupResponseDto.of(memberRepository.save(signupRequestDto.toEntity()));
    }
}
