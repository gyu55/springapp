package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.AiChatDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "AI 챗봇 응답 DTO")
public class AiChatResponseDTO {
    @Schema(description = "채팅 번호", example = "1")
    private Long id;
    @Schema(description = "채팅 내용", example = "수어에 대해 알려주세요.")
    private String aiChatContent;
    @Schema(description = "유저 메시지 여부 (0: AI, 1: 유저)", example = "1")
    private int aiChatIsUser;
    @Schema(description = "채팅 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime aiChatCreateAt;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;

    public static AiChatResponseDTO from(AiChatDTO dto) {
        AiChatResponseDTO res = new AiChatResponseDTO();
        res.setId(dto.getId());
        res.setAiChatContent(dto.getAiChatContent());
        res.setAiChatIsUser(dto.getAiChatIsUser());
        res.setAiChatCreateAt(dto.getAiChatCreateAt());
        res.setUserId(dto.getUserId());
        return res;
    }
}
