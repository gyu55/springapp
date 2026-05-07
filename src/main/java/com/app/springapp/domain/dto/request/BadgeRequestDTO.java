package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "뱃지 등록 요청 DTO")
public class BadgeRequestDTO {
    @Schema(description = "뱃지 이름", example = "출석왕", required = true)
    private String badgeName;
    @Schema(description = "뱃지 설명", example = "30일 연속 출석 달성!", required = true)
    private String badgeDetail;
    @Schema(description = "뱃지 아이콘", example = "default.jpg")
    private String badgeIcon;
}
