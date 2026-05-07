package com.app.springapp.domain.vo;

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
}
