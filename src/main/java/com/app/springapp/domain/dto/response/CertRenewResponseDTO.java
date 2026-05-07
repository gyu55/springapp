package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.CertRenewDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "자격증 갱신 응답 DTO")
public class CertRenewResponseDTO {
    @Schema(description = "갱신 번호", example = "1")
    private Long id;
    @Schema(description = "갱신 일시", example = "2024-01-01T00:00:00")
    private LocalDateTime certRenewCreateAt;
    @Schema(description = "시험 결과 번호", example = "1")
    private Long testResultId;

    public static CertRenewResponseDTO from(CertRenewDTO dto) {
        CertRenewResponseDTO res = new CertRenewResponseDTO();
        res.setId(dto.getId());
        res.setCertRenewCreateAt(dto.getCertRenewCreateAt());
        res.setTestResultId(dto.getTestResultId());
        return res;
    }
}
