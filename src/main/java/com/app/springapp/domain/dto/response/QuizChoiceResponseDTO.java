package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.QuizChoiceDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "퀴즈 보기 응답 DTO")
public class QuizChoiceResponseDTO {
    @Schema(description = "보기 번호", example = "1")
    private Long id;
    @Schema(description = "보기 번호 (1~4)", example = "1")
    private int quizChoiceNumber;
    @Schema(description = "정답 여부 (0: 오답, 1: 정답)", example = "0")
    private int quizChoiceIsCorrect;
    @Schema(description = "보기 내용", example = "안녕하세요")
    private String quizChoiceDetail;
    @Schema(description = "문제 번호", example = "1")
    private Long quizQuestionId;

    public static QuizChoiceResponseDTO from(QuizChoiceDTO dto) {
        QuizChoiceResponseDTO res = new QuizChoiceResponseDTO();
        res.setId(dto.getId());
        res.setQuizChoiceNumber(dto.getQuizChoiceNumber());
        res.setQuizChoiceIsCorrect(dto.getQuizChoiceIsCorrect());
        res.setQuizChoiceDetail(dto.getQuizChoiceDetail());
        res.setQuizQuestionId(dto.getQuizQuestionId());
        return res;
    }
}
