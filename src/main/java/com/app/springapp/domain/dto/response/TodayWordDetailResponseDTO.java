package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.TodayWordDetailDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "오늘의 수어 상세 응답 DTO")
public class TodayWordDetailResponseDTO {
    @Schema(description = "오늘의 수어 상세 번호", example = "1")
    private Long id;
    @Schema(description = "오늘의 수어 번호", example = "1")
    private Long todayWordId;
    @Schema(description = "퀴즈 문제 번호", example = "1")
    private Long quizQuestionId;

    public static TodayWordDetailResponseDTO from(TodayWordDetailDTO dto) {
        TodayWordDetailResponseDTO res = new TodayWordDetailResponseDTO();
        res.setId(dto.getId());
        res.setTodayWordId(dto.getTodayWordId());
        res.setQuizQuestionId(dto.getQuizQuestionId());
        return res;
    }
}
