package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "댓글 DTO")
public class CommentDTO {
    @Schema(description = "댓글 번호", example = "1")
    private Long id;
    @Schema(description = "댓글 내용", example = "좋은 글이네요!")
    private String commentContent;
    @Schema(description = "댓글 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime commentCreateAt;
    @Schema(description = "게시글 번호", example = "1")
    private Long postId;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;
    @Schema(description = "부모 댓글 번호 (대댓글인 경우)", example = "1")
    private Long commentId;
}
