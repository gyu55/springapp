package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "퀴즈 문제 등록 요청 DTO")
public class QuizQuestionRequestDTO {
    @Schema(description = "문제 타입", example = "객관식", required = true)
    private String quizQuestionType;
    @Schema(description = "문제 내용", example = "다음 수어는 무엇을 의미하나요?", required = true)
    private String quizQuestionDetail;
    @Schema(description = "수어 단어 번호", example = "1", required = true)
    private Long wordsId;
}
