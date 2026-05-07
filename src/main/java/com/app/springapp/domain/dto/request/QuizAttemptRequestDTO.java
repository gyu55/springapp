package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "퀴즈 풀이 회차 시작 요청 DTO")
public class QuizAttemptRequestDTO {
    @Schema(description = "유저 번호", example = "1", required = true)
    private Long userId;
    @Schema(description = "퀴즈 번호", example = "1", required = true)
    private Long quizId;
    @Schema(description = "총 문제 수", example = "10", required = true)
    private int quizAttemptTotalCount;
}
