package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "유저 가입 요청 DTO")
public class UserRequestDTO {
    @Schema(description = "유저 이름", example = "홍길동", required = true)
    private String userName;
    @Schema(description = "유저 닉네임", example = "길동이")
    private String userNickname;
    @Schema(description = "유저 소개", example = "안녕하세요!")
    private String userIntro;
    @Schema(description = "유저 직업", example = "개발자")
    private String userJob;
    @Schema(description = "유저 주소", example = "서울특별시 강남구")
    private String userAddress;
    @Schema(description = "유저 이메일", example = "user@example.com", required = true)
    private String userEmail;
    @Schema(description = "유저 전화번호", example = "010-1234-5678")
    private String userPhoneNum;
    @Schema(description = "유저 비밀번호", example = "password123!", required = true)
    private String userPassword;
    @Schema(description = "유저 프로필 이미지", example = "default.jpg")
    private String userProfile;
}
