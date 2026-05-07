package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "학습 시작 내역 DTO")
public class EduStartDTO {
    @Schema(description = "학습 시작 번호", example = "1")
    private Long id;
    @Schema(description = "학습 시작 일시", example = "2024-01-01T00:00:00")
    private LocalDateTime eduStartAt;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;
    @Schema(description = "학습 번호", example = "1")
    private Long eduId;
}
