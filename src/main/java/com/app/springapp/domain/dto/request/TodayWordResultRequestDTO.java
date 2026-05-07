package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "오늘의 수어 퀴즈 결과 요청 DTO")
public class TodayWordResultRequestDTO {
    @Schema(description = "정답 여부 (0: 오답, 1: 정답)", example = "0", required = true)
    private int todayWordResultIsCorrect;
    @Schema(description = "오늘의 수어 상세 번호", example = "1", required = true)
    private Long todayWordDetailId;
    @Schema(description = "선택한 보기 번호", example = "1", required = true)
    private Long quizChoiceId;
}
