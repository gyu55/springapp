package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.CommentLikeDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "댓글 좋아요 응답 DTO")
public class CommentLikeResponseDTO {
    @Schema(description = "댓글 좋아요 번호", example = "1")
    private Long id;
    @Schema(description = "좋아요 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime commentLikeCreateAt;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;
    @Schema(description = "댓글 번호", example = "1")
    private Long commentId;

    public static CommentLikeResponseDTO from(CommentLikeDTO dto) {
        CommentLikeResponseDTO res = new CommentLikeResponseDTO();
        res.setId(dto.getId());
        res.setCommentLikeCreateAt(dto.getCommentLikeCreateAt());
        res.setUserId(dto.getUserId());
        res.setCommentId(dto.getCommentId());
        return res;
    }
}
