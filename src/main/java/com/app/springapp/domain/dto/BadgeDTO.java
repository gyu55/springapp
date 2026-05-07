package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "뱃지 DTO")
public class BadgeDTO {
    @Schema(description = "뱃지 번호", example = "1")
    private Long id;
    @Schema(description = "뱃지 이름", example = "출석왕")
    private String badgeName;
    @Schema(description = "뱃지 설명", example = "30일 연속 출석 달성!")
    private String badgeDetail;
    @Schema(description = "뱃지 아이콘", example = "default.jpg")
    private String badgeIcon;
}
