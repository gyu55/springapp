package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "퀴즈-문제 구성 요청 DTO")
public class QuizEduRequestDTO {
    @Schema(description = "퀴즈 번호", example = "1", required = true)
    private Long quizId;
    @Schema(description = "퀴즈 문제 번호", example = "1", required = true)
    private Long quizQuestionId;
}
