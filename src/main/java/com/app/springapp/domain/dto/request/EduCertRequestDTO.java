package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "학습 수료증 발급 요청 DTO")
public class EduCertRequestDTO {
    @Schema(description = "학습 번호", example = "1", required = true)
    private Long eduId;
    @Schema(description = "유저 번호", example = "1", required = true)
    private Long userId;
}
