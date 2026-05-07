package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "유저 차단 DTO")
public class UserBlockDTO {
    @Schema(description = "차단 번호", example = "1")
    private Long id;
    @Schema(description = "차단 일시", example = "2024-01-01T00:00:00")
    private LocalDateTime userBlockCreateAt;
    @Schema(description = "차단한 유저 번호", example = "1")
    private Long blockerId;
    @Schema(description = "차단 당한 유저 번호", example = "2")
    private Long blockingId;
}
