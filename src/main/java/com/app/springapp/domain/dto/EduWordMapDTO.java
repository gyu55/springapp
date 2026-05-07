package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "학습-단어 매핑 DTO")
public class EduWordMapDTO {
    @Schema(description = "매핑 번호", example = "1")
    private Long id;
    @Schema(description = "학습 번호", example = "1")
    private Long eduId;
    @Schema(description = "단어 번호", example = "1")
    private Long wordsId;
}
