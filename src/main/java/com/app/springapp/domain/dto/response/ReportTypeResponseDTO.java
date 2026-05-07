package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.ReportTypeDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "신고 타입 응답 DTO")
public class ReportTypeResponseDTO {
    @Schema(description = "신고 타입 번호", example = "1")
    private Long id;
    @Schema(description = "신고 타입 이름", example = "욕설/비하")
    private String reportTypeName;
    @Schema(description = "신고 타입 설명", example = "욕설 및 비하 발언이 포함된 경우")
    private String reportTypeDetail;

    public static ReportTypeResponseDTO from(ReportTypeDTO dto) {
        ReportTypeResponseDTO res = new ReportTypeResponseDTO();
        res.setId(dto.getId());
        res.setReportTypeName(dto.getReportTypeName());
        res.setReportTypeDetail(dto.getReportTypeDetail());
        return res;
    }
}
