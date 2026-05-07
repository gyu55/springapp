package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.BadgeDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "뱃지 응답 DTO")
public class BadgeResponseDTO {
    @Schema(description = "뱃지 번호", example = "1")
    private Long id;
    @Schema(description = "뱃지 이름", example = "출석왕")
    private String badgeName;
    @Schema(description = "뱃지 설명", example = "30일 연속 출석 달성!")
    private String badgeDetail;
    @Schema(description = "뱃지 아이콘", example = "default.jpg")
    private String badgeIcon;

    public static BadgeResponseDTO from(BadgeDTO dto) {
        BadgeResponseDTO res = new BadgeResponseDTO();
        res.setId(dto.getId());
        res.setBadgeName(dto.getBadgeName());
        res.setBadgeDetail(dto.getBadgeDetail());
        res.setBadgeIcon(dto.getBadgeIcon());
        return res;
    }
}
