package com.app.springapp.domain.vo;

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
}
