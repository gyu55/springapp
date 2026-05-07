package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "수어 학습 등록 요청 DTO")
public class EduRequestDTO {
    @Schema(description = "학습 제목", example = "기초 수어 학습", required = true)
    private String eduTitle;
    @Schema(description = "학습 설명", example = "기초 수어를 배울 수 있습니다.", required = true)
    private String eduDetail;
    @Schema(description = "다이아 가격", example = "0")
    private int eduDia;
}
