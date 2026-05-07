package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "팔로우 타입 DTO")
public class FollowTypeDTO {
    @Schema(description = "팔로우 타입 번호", example = "1")
    private Long id;
    @Schema(description = "팔로우 타입 이름", example = "일반 팔로우")
    private String followTypeName;
    @Schema(description = "팔로우 타입 설명", example = "일반 팔로우 관계입니다.")
    private String followTypeDetail;
}
