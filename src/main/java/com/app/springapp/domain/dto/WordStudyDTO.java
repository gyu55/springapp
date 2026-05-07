package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "단어 학습 내역 DTO")
public class WordStudyDTO {
    @Schema(description = "단어 학습 번호", example = "1")
    private Long id;
    @Schema(description = "학습 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime wordStudyCreateAt;
    @Schema(description = "학습 수정일시", example = "2024-01-01T00:00:00")
    private LocalDateTime wordStudyUpdateAt;
    @Schema(description = "학습 완료 여부 (0: 미완료, 1: 완료)", example = "0")
    private int wordStudyIsCompleted;
    @Schema(description = "학습-단어 매핑 번호", example = "1")
    private Long eduWordMapId;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;
}
