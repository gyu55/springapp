package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "댓글 좋아요 DTO")
public class CommentLikeDTO {
    @Schema(description = "댓글 좋아요 번호", example = "1")
    private Long id;
    @Schema(description = "좋아요 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime commentLikeCreateAt;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;
    @Schema(description = "댓글 번호", example = "1")
    private Long commentId;
}
