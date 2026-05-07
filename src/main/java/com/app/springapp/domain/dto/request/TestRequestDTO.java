package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "자격증 시험 등록 요청 DTO")
public class TestRequestDTO {
    @Schema(description = "시험 제목", example = "수어 자격증 1급", required = true)
    private String testTitle;
    @Schema(description = "시험 설명", example = "수어 통역사 자격증 1급 시험입니다.", required = true)
    private String testDetail;
    @Schema(description = "시험 일시", example = "2024-06-01T10:00:00", required = true)
    private LocalDateTime testDate;
    @Schema(description = "시험 정원", example = "60")
    private int testLimit;
    @Schema(description = "시험 장소", example = "서울특별시 강남구 테헤란로 123", required = true)
    private String testLocation;
    @Schema(description = "시험 응시료", example = "50000")
    private int testPrice;
}
