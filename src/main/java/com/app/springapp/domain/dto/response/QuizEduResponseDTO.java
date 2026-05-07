package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.QuizEduDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "퀴즈-문제 구성 응답 DTO")
public class QuizEduResponseDTO {
    @Schema(description = "퀴즈-문제 번호", example = "1")
    private Long id;
    @Schema(description = "퀴즈 번호", example = "1")
    private Long quizId;
    @Schema(description = "퀴즈 문제 번호", example = "1")
    private Long quizQuestionId;

    public static QuizEduResponseDTO from(QuizEduDTO dto) {
        QuizEduResponseDTO res = new QuizEduResponseDTO();
        res.setId(dto.getId());
        res.setQuizId(dto.getQuizId());
        res.setQuizQuestionId(dto.getQuizQuestionId());
        return res;
    }
}
