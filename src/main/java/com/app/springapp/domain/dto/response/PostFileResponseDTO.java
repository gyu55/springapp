package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.PostFileDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "게시글 첨부파일 응답 DTO")
public class PostFileResponseDTO {
    @Schema(description = "첨부파일 번호", example = "1")
    private Long id;
    @Schema(description = "파일 경로", example = "/uploads/2024/01/file.jpg")
    private String postFileDir;
    @Schema(description = "파일 타입", example = "image/jpeg")
    private String postFileType;
    @Schema(description = "파일 업로드 일시", example = "2024-01-01T00:00:00")
    private LocalDateTime postFileCreateAt;
    @Schema(description = "게시글 번호", example = "1")
    private Long postId;

    public static PostFileResponseDTO from(PostFileDTO dto) {
        PostFileResponseDTO res = new PostFileResponseDTO();
        res.setId(dto.getId());
        res.setPostFileDir(dto.getPostFileDir());
        res.setPostFileType(dto.getPostFileType());
        res.setPostFileCreateAt(dto.getPostFileCreateAt());
        res.setPostId(dto.getPostId());
        return res;
    }
}
