package com.example.shoppingmallspring.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@Getter
public class MemberFormDto {
    @NotBlank(message = "이름을 입력하세요.")
    private String name;

    @NotEmpty(message = "이메일을 입력하세요.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String email;

    @NotEmpty(message = "비밀번호를 입력하세요.")
    @Length(min = 4, max = 16, message = "비밀번호는 4자 이상, 16자 이하로 입력해주세요.")
    private String password;

    @NotEmpty(message = "주소를 입력하세요.")
    private String address;

    @Builder
    public MemberFormDto(String name, String email, String password, String address){
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }
}