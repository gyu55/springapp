package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "퀴즈 보기 등록 요청 DTO")
public class QuizChoiceRequestDTO {
    @Schema(description = "보기 번호 (1~4)", example = "1", required = true)
    private int quizChoiceNumber;
    @Schema(description = "정답 여부 (0: 오답, 1: 정답)", example = "0", required = true)
    private int quizChoiceIsCorrect;
    @Schema(description = "보기 내용", example = "안녕하세요", required = true)
    private String quizChoiceDetail;
    @Schema(description = "문제 번호", example = "1", required = true)
    private Long quizQuestionId;
}
