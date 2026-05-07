package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "퀴즈-문제 구성 DTO")
public class QuizEduDTO {
    @Schema(description = "퀴즈-문제 번호", example = "1")
    private Long id;
    @Schema(description = "퀴즈 번호", example = "1")
    private Long quizId;
    @Schema(description = "퀴즈 문제 번호", example = "1")
    private Long quizQuestionId;
}
