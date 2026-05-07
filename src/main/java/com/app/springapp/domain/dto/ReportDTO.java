package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "통합 신고 DTO")
public class ReportDTO {
    @Schema(description = "신고 번호", example = "1")
    private Long id;
    @Schema(description = "신고 제목", example = "부적절한 사용자 신고")
    private String reportTitle;
    @Schema(description = "신고 내용", example = "지속적인 욕설 및 괴롭힘 행위가 있습니다.")
    private String reportDetail;
    @Schema(description = "신고 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime reportCreateAt;
    @Schema(description = "신고 타입 번호", example = "1")
    private Long reportTypeId;
    @Schema(description = "신고자 유저 번호", example = "1")
    private Long userId;
}
