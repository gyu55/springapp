package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "오늘의 수어 상세 DTO")
public class TodayWordDetailDTO {
    @Schema(description = "오늘의 수어 상세 번호", example = "1")
    private Long id;
    @Schema(description = "오늘의 수어 번호", example = "1")
    private Long todayWordId;
    @Schema(description = "퀴즈 문제 번호", example = "1")
    private Long quizQuestionId;
}
