package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "시험 결과 DTO")
public class TestResultDTO {
    @Schema(description = "시험 결과 번호", example = "1")
    private Long id;
    @Schema(description = "시험 점수", example = "85")
    private int testResultPoint;
    @Schema(description = "시험 신청 번호", example = "1")
    private Long testApplyId;
}
