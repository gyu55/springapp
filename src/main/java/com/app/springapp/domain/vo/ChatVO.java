package com.app.springapp.domain.vo;

import com.app.springapp.domain.dto.request.ChatRequestDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class ChatVO {
    private Long id;
    private String chatContent;
    private LocalDateTime chatCreateAt;
    private String chatType;
    private Long userId;
    private Long chatRoomId;

    public static ChatVO from(ChatRequestDTO chatRequestDTO) {
        ChatVO chatVO = new ChatVO();
        chatVO.setChatContent(chatRequestDTO.getChatContent());
        chatVO.setChatType(chatRequestDTO.getChatType());
        return chatVO;
    }
}
