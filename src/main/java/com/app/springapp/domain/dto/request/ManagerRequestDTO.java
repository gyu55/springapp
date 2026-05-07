package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "관리자 등록 요청 DTO")
public class ManagerRequestDTO {
    @Schema(description = "관리자 이름", example = "관리자", required = true)
    private String managerName;
    @Schema(description = "관리자 이메일", example = "admin@example.com", required = true)
    private String managerEmail;
    @Schema(description = "관리자 비밀번호", example = "admin123!", required = true)
    private String managerPassword;
    @Schema(description = "관리자 직책", example = "일반관리자")
    private String managerPosition;
}
