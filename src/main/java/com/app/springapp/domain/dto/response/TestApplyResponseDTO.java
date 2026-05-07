package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.TestApplyDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "시험 신청 응답 DTO")
public class TestApplyResponseDTO {
    @Schema(description = "신청 번호", example = "1")
    private Long id;
    @Schema(description = "신청 일시", example = "2024-01-01T00:00:00")
    private LocalDateTime testApplyAt;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;
    @Schema(description = "시험 번호", example = "1")
    private Long testId;

    public static TestApplyResponseDTO from(TestApplyDTO dto) {
        TestApplyResponseDTO res = new TestApplyResponseDTO();
        res.setId(dto.getId());
        res.setTestApplyAt(dto.getTestApplyAt());
        res.setUserId(dto.getUserId());
        res.setTestId(dto.getTestId());
        return res;
    }
}
