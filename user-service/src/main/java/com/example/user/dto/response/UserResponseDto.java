package com.example.user.dto.response;

import com.example.common.dto.TokenDto;
import com.example.user.conts.Authority;
import com.example.user.repository.Member;
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

    public static UserResponseDto of(Member user){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, UserResponseDto.class);
    }
}
