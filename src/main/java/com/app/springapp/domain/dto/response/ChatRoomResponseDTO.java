package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.ChatRoomDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "채팅방 응답 DTO")
public class ChatRoomResponseDTO {
    @Schema(description = "채팅방 번호", example = "1")
    private Long id;
    @Schema(description = "채팅방 이름", example = "수어 학습 모임")
    private String chatRoomName;
    @Schema(description = "채팅방 타입", example = "그룹")
    private String chatRoomType;
    @Schema(description = "채팅방 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime chatRoomCreateAt;
    @Schema(description = "채팅방 프로필 이미지", example = "default.jpg")
    private String chatRoomProfile;
    @Schema(description = "채팅방 개설자 유저 번호", example = "1")
    private Long userId;

    public static ChatRoomResponseDTO from(ChatRoomDTO dto) {
        ChatRoomResponseDTO res = new ChatRoomResponseDTO();
        res.setId(dto.getId());
        res.setChatRoomName(dto.getChatRoomName());
        res.setChatRoomType(dto.getChatRoomType());
        res.setChatRoomCreateAt(dto.getChatRoomCreateAt());
        res.setChatRoomProfile(dto.getChatRoomProfile());
        res.setUserId(dto.getUserId());
        return res;
    }
}
