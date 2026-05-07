package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.EduStartDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "학습 시작 내역 응답 DTO")
public class EduStartResponseDTO {
    @Schema(description = "학습 시작 번호", example = "1")
    private Long id;
    @Schema(description = "학습 시작 일시", example = "2024-01-01T00:00:00")
    private LocalDateTime eduStartAt;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;
    @Schema(description = "학습 번호", example = "1")
    private Long eduId;

    public static EduStartResponseDTO from(EduStartDTO dto) {
        EduStartResponseDTO res = new EduStartResponseDTO();
        res.setId(dto.getId());
        res.setEduStartAt(dto.getEduStartAt());
        res.setUserId(dto.getUserId());
        res.setEduId(dto.getEduId());
        return res;
    }
}
