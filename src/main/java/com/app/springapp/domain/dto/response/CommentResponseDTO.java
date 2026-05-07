package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.CommentDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "댓글 응답 DTO")
public class CommentResponseDTO {
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

    public static CommentResponseDTO from(CommentDTO dto) {
        CommentResponseDTO res = new CommentResponseDTO();
        res.setId(dto.getId());
        res.setCommentContent(dto.getCommentContent());
        res.setCommentCreateAt(dto.getCommentCreateAt());
        res.setPostId(dto.getPostId());
        res.setUserId(dto.getUserId());
        res.setCommentId(dto.getCommentId());
        return res;
    }
}
