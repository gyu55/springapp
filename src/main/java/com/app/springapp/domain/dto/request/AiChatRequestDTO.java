package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "AI 챗봇 메시지 요청 DTO")
public class AiChatRequestDTO {
    @Schema(description = "채팅 내용", example = "수어에 대해 알려주세요.", required = true)
    private String aiChatContent;
    @Schema(description = "유저 메시지 여부 (0: AI, 1: 유저)", example = "1", required = true)
    private int aiChatIsUser;
    @Schema(description = "유저 번호", example = "1", required = true)
    private Long userId;
}
