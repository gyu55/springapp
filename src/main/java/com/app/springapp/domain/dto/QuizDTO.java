package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "분야별 퀴즈 DTO")
public class QuizDTO {
    @Schema(description = "퀴즈 번호", example = "1")
    private Long id;
    @Schema(description = "퀴즈 제목", example = "기초 수어 퀴즈")
    private String quizTitle;
    @Schema(description = "퀴즈 설명", example = "기초 수어를 테스트합니다.")
    private String quizDetail;
    @Schema(description = "퀴즈 카테고리", example = "인사")
    private String quizCategory;
    @Schema(description = "퀴즈 썸네일", example = "default.jpg")
    private String quizThumbnail;
    @Schema(description = "퀴즈 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime quizCreateAt;
}
