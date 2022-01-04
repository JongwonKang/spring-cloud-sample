package com.example.user.repository;

import com.example.user.conts.Authority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_member")
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String loginId;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private Authority authority;


    @Builder
    public Member(String loginId, String email, String password, Authority authority) {
        this.loginId = loginId;
        this.email = email;
        this.password = password;
        this.authority = authority;
    }
}
