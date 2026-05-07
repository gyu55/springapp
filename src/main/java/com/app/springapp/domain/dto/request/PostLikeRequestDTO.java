package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "게시글 좋아요 요청 DTO")
public class PostLikeRequestDTO {
    @Schema(description = "유저 번호", example = "1", required = true)
    private Long userId;
    @Schema(description = "게시글 번호", example = "1", required = true)
    private Long postId;
}
