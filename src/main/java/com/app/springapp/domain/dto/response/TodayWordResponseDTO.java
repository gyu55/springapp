package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.TodayWordDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "오늘의 수어 응답 DTO")
public class TodayWordResponseDTO {
    @Schema(description = "오늘의 수어 번호", example = "1")
    private Long id;
    @Schema(description = "오늘의 수어 날짜", example = "2024-01-01")
    private LocalDate todayWordDate;
    @Schema(description = "생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime todayWordCreateAt;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;

    public static TodayWordResponseDTO from(TodayWordDTO dto) {
        TodayWordResponseDTO res = new TodayWordResponseDTO();
        res.setId(dto.getId());
        res.setTodayWordDate(dto.getTodayWordDate());
        res.setTodayWordCreateAt(dto.getTodayWordCreateAt());
        res.setUserId(dto.getUserId());
        return res;
    }
}
