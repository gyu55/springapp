package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.ManagerDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "관리자 응답 DTO")
public class ManagerResponseDTO {
    @Schema(description = "관리자 번호", example = "1")
    private Long id;
    @Schema(description = "관리자 이름", example = "관리자")
    private String managerName;
    @Schema(description = "관리자 이메일", example = "admin@example.com")
    private String managerEmail;
    @Schema(description = "관리자 직책", example = "일반관리자")
    private String managerPosition;

    public static ManagerResponseDTO from(ManagerDTO dto) {
        ManagerResponseDTO res = new ManagerResponseDTO();
        res.setId(dto.getId());
        res.setManagerName(dto.getManagerName());
        res.setManagerEmail(dto.getManagerEmail());
        res.setManagerPosition(dto.getManagerPosition());
        return res;
    }
}
