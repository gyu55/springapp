package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "게시글 첨부파일 요청 DTO")
public class PostFileRequestDTO {
    @Schema(description = "파일 경로", example = "/uploads/2024/01/file.jpg", required = true)
    private String postFileDir;
    @Schema(description = "파일 타입", example = "image/jpeg", required = true)
    private String postFileType;
    @Schema(description = "게시글 번호", example = "1", required = true)
    private Long postId;
}
