package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "유저 차단 요청 DTO")
public class UserBlockRequestDTO {
    @Schema(description = "차단한 유저 번호", example = "1", required = true)
    private Long blockerId;
    @Schema(description = "차단 당한 유저 번호", example = "2", required = true)
    private Long blockingId;
}
