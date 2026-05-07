package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.ReportResultDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "신고 처리 결과 응답 DTO")
public class ReportResultResponseDTO {
    @Schema(description = "신고 처리 결과 번호", example = "1")
    private Long id;
    @Schema(description = "처리 일시", example = "2024-01-01T00:00:00")
    private LocalDateTime reportResultAt;
    @Schema(description = "처리 결과 제목", example = "신고 처리 완료")
    private String reportResultTitle;
    @Schema(description = "처리 결과 내용", example = "해당 사용자에게 경고 조치를 취했습니다.")
    private String reportResultDetail;
    @Schema(description = "신고 번호", example = "1")
    private Long reportId;
    @Schema(description = "처리 관리자 번호", example = "1")
    private Long managerId;

    public static ReportResultResponseDTO from(ReportResultDTO dto) {
        ReportResultResponseDTO res = new ReportResultResponseDTO();
        res.setId(dto.getId());
        res.setReportResultAt(dto.getReportResultAt());
        res.setReportResultTitle(dto.getReportResultTitle());
        res.setReportResultDetail(dto.getReportResultDetail());
        res.setReportId(dto.getReportId());
        res.setManagerId(dto.getManagerId());
        return res;
    }
}
