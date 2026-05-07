package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "유저 뱃지 취득 요청 DTO")
public class UserBadgeRequestDTO {
    @Schema(description = "유저 번호", example = "1", required = true)
    private Long userId;
    @Schema(description = "뱃지 번호", example = "1", required = true)
    private Long badgeId;
}
