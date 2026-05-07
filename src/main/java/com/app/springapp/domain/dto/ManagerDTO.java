package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "관리자 DTO")
public class ManagerDTO {
    @Schema(description = "관리자 번호", example = "1")
    private Long id;
    @Schema(description = "관리자 이름", example = "관리자")
    private String managerName;
    @Schema(description = "관리자 이메일", example = "admin@example.com")
    private String managerEmail;
    @Schema(description = "관리자 비밀번호", example = "admin123!")
    private String managerPassword;
    @Schema(description = "관리자 직책", example = "일반관리자")
    private String managerPosition;
}
