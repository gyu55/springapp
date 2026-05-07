package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "팔로우 타입 등록 요청 DTO")
public class FollowTypeRequestDTO {
    @Schema(description = "팔로우 타입 이름", example = "일반 팔로우", required = true)
    private String followTypeName;
    @Schema(description = "팔로우 타입 설명", example = "일반 팔로우 관계입니다.", required = true)
    private String followTypeDetail;
}
