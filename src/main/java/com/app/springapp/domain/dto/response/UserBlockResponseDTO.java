package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.UserBlockDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "유저 차단 응답 DTO")
public class UserBlockResponseDTO {
    @Schema(description = "차단 번호", example = "1")
    private Long id;
    @Schema(description = "차단 일시", example = "2024-01-01T00:00:00")
    private LocalDateTime userBlockCreateAt;
    @Schema(description = "차단한 유저 번호", example = "1")
    private Long blockerId;
    @Schema(description = "차단 당한 유저 번호", example = "2")
    private Long blockingId;

    public static UserBlockResponseDTO from(UserBlockDTO dto) {
        UserBlockResponseDTO res = new UserBlockResponseDTO();
        res.setId(dto.getId());
        res.setUserBlockCreateAt(dto.getUserBlockCreateAt());
        res.setBlockerId(dto.getBlockerId());
        res.setBlockingId(dto.getBlockingId());
        return res;
    }
}
