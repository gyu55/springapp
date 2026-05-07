package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "유저 신고 DTO")
public class UserReportDTO {
    @Schema(description = "신고 번호", example = "1")
    private Long id;
    @Schema(description = "신고 제목", example = "욕설 사용")
    private String userReportTitle;
    @Schema(description = "신고 내용", example = "심한 욕설을 사용했습니다.")
    private String userReportDetail;
    @Schema(description = "신고 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime userReportCreateAt;
    @Schema(description = "신고 대상 유저 번호", example = "1")
    private Long userId;
    @Schema(description = "신고자 유저 번호", example = "2")
    private Long reportingUserId;
}
