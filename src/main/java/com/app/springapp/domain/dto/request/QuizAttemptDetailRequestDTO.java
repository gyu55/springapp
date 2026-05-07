package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "퀴즈 풀이 문제별 상세 요청 DTO")
public class QuizAttemptDetailRequestDTO {
    @Schema(description = "풀이 회차 번호", example = "1", required = true)
    private Long quizAttemptId;
    @Schema(description = "퀴즈 문제 번호", example = "1", required = true)
    private Long quizQuestionId;
    @Schema(description = "선택한 보기 번호", example = "1", required = true)
    private Long quizChoiceId;
    @Schema(description = "정답 여부 (0: 오답, 1: 정답)", example = "1", required = true)
    private int quizAttemptDetailIsCorrect;
}
