package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "신고 타입 등록 요청 DTO")
public class ReportTypeRequestDTO {
    @Schema(description = "신고 타입 이름", example = "욕설/비하", required = true)
    private String reportTypeName;
    @Schema(description = "신고 타입 설명", example = "욕설 및 비하 발언이 포함된 경우", required = true)
    private String reportTypeDetail;
}
