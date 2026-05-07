package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "오늘의 수어 DTO")
public class TodayWordDTO {
    @Schema(description = "오늘의 수어 번호", example = "1")
    private Long id;
    @Schema(description = "오늘의 수어 날짜", example = "2024-01-01")
    private LocalDate todayWordDate;
    @Schema(description = "생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime todayWordCreateAt;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;
}
