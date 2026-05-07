package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "단어 학습 요청 DTO")
public class WordStudyRequestDTO {
    @Schema(description = "학습-단어 매핑 번호", example = "1", required = true)
    private Long eduWordMapId;
    @Schema(description = "유저 번호", example = "1", required = true)
    private Long userId;
    @Schema(description = "학습 완료 여부 (0: 미완료, 1: 완료)", example = "0")
    private int wordStudyIsCompleted;
}
