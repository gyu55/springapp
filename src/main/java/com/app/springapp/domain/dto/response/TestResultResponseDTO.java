package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.TestResultDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "시험 결과 응답 DTO")
public class TestResultResponseDTO {
    @Schema(description = "시험 결과 번호", example = "1")
    private Long id;
    @Schema(description = "시험 점수", example = "85")
    private int testResultPoint;
    @Schema(description = "시험 신청 번호", example = "1")
    private Long testApplyId;

    public static TestResultResponseDTO from(TestResultDTO dto) {
        TestResultResponseDTO res = new TestResultResponseDTO();
        res.setId(dto.getId());
        res.setTestResultPoint(dto.getTestResultPoint());
        res.setTestApplyId(dto.getTestApplyId());
        return res;
    }
}
