package com.app.springapp.domain.dto.response;

import com.app.springapp.domain.dto.QuizAttemptDetailDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "퀴즈 풀이 문제별 상세 응답 DTO")
public class QuizAttemptDetailResponseDTO {
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

    public static QuizAttemptDetailResponseDTO from(QuizAttemptDetailDTO dto) {
        QuizAttemptDetailResponseDTO res = new QuizAttemptDetailResponseDTO();
        res.setId(dto.getId());
        res.setQuizAttemptId(dto.getQuizAttemptId());
        res.setQuizQuestionId(dto.getQuizQuestionId());
        res.setQuizChoiceId(dto.getQuizChoiceId());
        res.setQuizAttemptDetailIsCorrect(dto.getQuizAttemptDetailIsCorrect());
        return res;
    }
}
