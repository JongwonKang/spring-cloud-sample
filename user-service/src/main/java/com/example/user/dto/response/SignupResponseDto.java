package com.example.user.dto.response;

import com.example.user.repository.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
@NoArgsConstructor
public class SignupResponseDto {
    private Long id;
    private String loginId;
    private String email;

    public static SignupResponseDto of(Member user){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, SignupResponseDto.class);
    }
}
