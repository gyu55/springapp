package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "자격증 갱신 DTO")
public class CertRenewDTO {
    @Schema(description = "갱신 번호", example = "1")
    private Long id;
    @Schema(description = "갱신 일시", example = "2024-01-01T00:00:00")
    private LocalDateTime certRenewCreateAt;
    @Schema(description = "시험 결과 번호", example = "1")
    private Long testResultId;
}
