package com.example.user.service;

import com.example.user.dto.request.LoginRequestDto;
import com.example.user.dto.response.UserResponseDto;
import com.example.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public Long getUser(Long id){
        return id;
    }

    @Transactional
    public UserResponseDto signup(LoginRequestDto loginRequestDto){
        return UserResponseDto.of(userRepository.save(loginRequestDto.toEntity()));
    }
}
