package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "신고 처리 결과 요청 DTO")
public class ReportResultRequestDTO {
    @Schema(description = "처리 결과 제목", example = "신고 처리 완료", required = true)
    private String reportResultTitle;
    @Schema(description = "처리 결과 내용", example = "해당 사용자에게 경고 조치를 취했습니다.", required = true)
    private String reportResultDetail;
    @Schema(description = "신고 번호", example = "1", required = true)
    private Long reportId;
    @Schema(description = "처리 관리자 번호", example = "1", required = true)
    private Long managerId;
}
