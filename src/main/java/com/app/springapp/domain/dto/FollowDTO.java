package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "팔로우 DTO")
public class FollowDTO {
    @Schema(description = "팔로우 번호", example = "1")
    private Long id;
    @Schema(description = "팔로우 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime followCreateAt;
    @Schema(description = "팔로우 타입", example = "일반 팔로우")
    private String followType;
    @Schema(description = "팔로우 타입 번호", example = "1")
    private Long followTypeId;
    @Schema(description = "팔로워 유저 번호", example = "1")
    private Long followerId;
    @Schema(description = "팔로잉 유저 번호", example = "2")
    private Long followingId;
}
