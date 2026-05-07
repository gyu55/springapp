package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.EduCertDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "학습 수료증 응답 DTO")
public class EduCertResponseDTO {
    @Schema(description = "수료증 번호", example = "1")
    private Long id;
    @Schema(description = "수료증 발급일시", example = "2024-01-01T00:00:00")
    private LocalDateTime eduCertCreateAt;
    @Schema(description = "학습 번호", example = "1")
    private Long eduId;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;

    public static EduCertResponseDTO from(EduCertDTO dto) {
        EduCertResponseDTO res = new EduCertResponseDTO();
        res.setId(dto.getId());
        res.setEduCertCreateAt(dto.getEduCertCreateAt());
        res.setEduId(dto.getEduId());
        res.setUserId(dto.getUserId());
        return res;
    }
}
