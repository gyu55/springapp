package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "퀴즈 풀이 문제별 상세 DTO")
public class QuizAttemptDetailDTO {
    @Schema(description = "상세 번호", example = "1")
    private Long id;
    @Schema(description = "풀이 회차 번호", example = "1")
    private Long quizAttemptId;
    @Schema(description = "퀴즈 문제 번호", example = "1")
    private Long quizQuestionId;
    @Schema(description = "선택한 보기 번호", example = "1")
    private Long quizChoiceId;
    @Schema(description = "정답 여부 (0: 오답, 1: 정답)", example = "1")
    private int quizAttemptDetailIsCorrect;
}
