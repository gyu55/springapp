package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "게시글 신고 DTO")
public class PostReportDTO {
    @Schema(description = "신고 번호", example = "1")
    private Long id;
    @Schema(description = "신고 제목", example = "부적절한 게시글")
    private String postReportTitle;
    @Schema(description = "신고 내용", example = "욕설 및 혐오 표현이 포함된 게시글입니다.")
    private String postReportDetail;
    @Schema(description = "신고 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime postReportCreateAt;
    @Schema(description = "신고자 유저 번호", example = "1")
    private Long userId;
    @Schema(description = "신고 대상 게시글 번호", example = "1")
    private Long postId;
}
