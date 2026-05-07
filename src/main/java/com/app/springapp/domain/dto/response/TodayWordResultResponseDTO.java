package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.TodayWordResultDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "오늘의 수어 퀴즈 결과 응답 DTO")
public class TodayWordResultResponseDTO {
    @Schema(description = "결과 번호", example = "1")
    private Long id;
    @Schema(description = "결과 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime todayWordResultCreateAt;
    @Schema(description = "정답 여부 (0: 오답, 1: 정답)", example = "0")
    private int todayWordResultIsCorrect;
    @Schema(description = "오늘의 수어 상세 번호", example = "1")
    private Long todayWordDetailId;
    @Schema(description = "선택한 보기 번호", example = "1")
    private Long quizChoiceId;

    public static TodayWordResultResponseDTO from(TodayWordResultDTO dto) {
        TodayWordResultResponseDTO res = new TodayWordResultResponseDTO();
        res.setId(dto.getId());
        res.setTodayWordResultCreateAt(dto.getTodayWordResultCreateAt());
        res.setTodayWordResultIsCorrect(dto.getTodayWordResultIsCorrect());
        res.setTodayWordDetailId(dto.getTodayWordDetailId());
        res.setQuizChoiceId(dto.getQuizChoiceId());
        return res;
    }
}
