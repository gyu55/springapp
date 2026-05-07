package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "분야별 퀴즈 등록 요청 DTO")
public class QuizRequestDTO {
    @Schema(description = "퀴즈 제목", example = "기초 수어 퀴즈", required = true)
    private String quizTitle;
    @Schema(description = "퀴즈 설명", example = "기초 수어를 테스트합니다.", required = true)
    private String quizDetail;
    @Schema(description = "퀴즈 카테고리", example = "인사", required = true)
    private String quizCategory;
    @Schema(description = "퀴즈 썸네일", example = "default.jpg")
    private String quizThumbnail;
}
