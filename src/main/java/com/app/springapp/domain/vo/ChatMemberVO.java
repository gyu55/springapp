package com.app.springapp.domain.vo;

import com.app.springapp.domain.dto.request.ChatMemberRequestDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class ChatMemberVO {
    private Long id;
    private LocalDateTime chatStartAt;
    private LocalDateTime chatLastReadAt;
    private Long userId;
    private Long chatRoomId;

//    채팅방 참여 요청 DTO -> VO 변환
    public static ChatMemberVO from(ChatMemberRequestDTO chatMemberRequestDTO) {
        ChatMemberVO chatMemberVO = new ChatMemberVO();
        chatMemberVO.setChatRoomId(chatMemberRequestDTO.getChatRoomId());
        chatMemberVO.setUserId(chatMemberRequestDTO.getUserId());

        return chatMemberVO;
    }
}
