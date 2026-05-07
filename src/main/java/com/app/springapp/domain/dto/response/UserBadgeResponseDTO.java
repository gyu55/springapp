package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.UserBadgeDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "유저 뱃지 응답 DTO")
public class UserBadgeResponseDTO {
    @Schema(description = "유저 뱃지 번호", example = "1")
    private Long id;
    @Schema(description = "뱃지 취득 일시", example = "2024-01-01T00:00:00")
    private LocalDateTime userBadgeCreateAt;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;
    @Schema(description = "뱃지 번호", example = "1")
    private Long badgeId;

    public static UserBadgeResponseDTO from(UserBadgeDTO dto) {
        UserBadgeResponseDTO res = new UserBadgeResponseDTO();
        res.setId(dto.getId());
        res.setUserBadgeCreateAt(dto.getUserBadgeCreateAt());
        res.setUserId(dto.getUserId());
        res.setBadgeId(dto.getBadgeId());
        return res;
    }
}
