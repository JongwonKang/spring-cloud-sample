package com.example.user.dto.response;

import com.example.common.dto.TokenDto;
import com.example.user.conts.Authority;
import com.example.user.repository.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
@NoArgsConstructor
public class UserResponseDto {
    private Long id;
    private String loginId;
    private String email;
    private Authority authority;
    private TokenDto tokenDto;

    @Builder
    public UserResponseDto(Long id, String loginId, String email, Authority authority, TokenDto tokenDto) {
        this.id = id;
        this.loginId = loginId;
        this.email = email;
        this.authority = authority;
        this.tokenDto = tokenDto;
    }

    public static UserResponseDto of(Member user){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, UserResponseDto.class);
    }
}
