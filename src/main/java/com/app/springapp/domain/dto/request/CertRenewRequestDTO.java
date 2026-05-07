package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "자격증 갱신 요청 DTO")
public class CertRenewRequestDTO {
    @Schema(description = "시험 결과 번호", example = "1", required = true)
    private Long testResultId;
}
