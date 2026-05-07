package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "오늘의 수어 상세 요청 DTO")
public class TodayWordDetailRequestDTO {
    @Schema(description = "오늘의 수어 번호", example = "1", required = true)
    private Long todayWordId;
    @Schema(description = "퀴즈 문제 번호", example = "1", required = true)
    private Long quizQuestionId;
}
