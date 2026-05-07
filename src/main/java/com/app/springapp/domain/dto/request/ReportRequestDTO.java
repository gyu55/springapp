package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "통합 신고 요청 DTO")
public class ReportRequestDTO {
    @Schema(description = "신고 제목", example = "부적절한 사용자 신고", required = true)
    private String reportTitle;
    @Schema(description = "신고 내용", example = "지속적인 욕설 및 괴롭힘 행위가 있습니다.", required = true)
    private String reportDetail;
    @Schema(description = "신고 타입 번호", example = "1", required = true)
    private Long reportTypeId;
    @Schema(description = "신고자 유저 번호", example = "1", required = true)
    private Long userId;
}
