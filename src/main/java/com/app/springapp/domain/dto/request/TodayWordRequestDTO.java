package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "오늘의 수어 생성 요청 DTO")
public class TodayWordRequestDTO {
    @Schema(description = "유저 번호", example = "1", required = true)
    private Long userId;
}
