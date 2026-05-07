package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "시험 결과 등록 요청 DTO")
public class TestResultRequestDTO {
    @Schema(description = "시험 점수", example = "85", required = true)
    private int testResultPoint;
    @Schema(description = "시험 신청 번호", example = "1", required = true)
    private Long testApplyId;
}
