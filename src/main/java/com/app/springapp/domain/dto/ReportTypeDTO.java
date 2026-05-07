package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "신고 타입 DTO")
public class ReportTypeDTO {
    @Schema(description = "신고 타입 번호", example = "1")
    private Long id;
    @Schema(description = "신고 타입 이름", example = "욕설/비하")
    private String reportTypeName;
    @Schema(description = "신고 타입 설명", example = "욕설 및 비하 발언이 포함된 경우")
    private String reportTypeDetail;
}
