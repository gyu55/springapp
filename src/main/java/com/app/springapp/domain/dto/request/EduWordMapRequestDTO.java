package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "학습-단어 매핑 요청 DTO")
public class EduWordMapRequestDTO {
    @Schema(description = "학습 번호", example = "1", required = true)
    private Long eduId;
    @Schema(description = "단어 번호", example = "1", required = true)
    private Long wordsId;
}
