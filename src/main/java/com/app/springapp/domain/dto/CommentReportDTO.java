package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "댓글 신고 DTO")
public class CommentReportDTO {
    @Schema(description = "신고 번호", example = "1")
    private Long id;
    @Schema(description = "신고 제목", example = "부적절한 댓글")
    private String commentReportTitle;
    @Schema(description = "신고 내용", example = "욕설이 포함된 댓글입니다.")
    private String commentReportDetail;
    @Schema(description = "신고 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime commentReportCreateAt;
    @Schema(description = "신고자 유저 번호", example = "1")
    private Long userId;
    @Schema(description = "신고 대상 댓글 번호", example = "1")
    private Long commentId;
}
