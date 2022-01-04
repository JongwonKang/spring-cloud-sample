package com.example.user.dto.response;

import com.example.user.repository.User;
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

    public static UserResponseDto of(User user){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(user, UserResponseDto.class);
    }
}
