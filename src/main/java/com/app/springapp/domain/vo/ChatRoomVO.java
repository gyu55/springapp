package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class ChatRoomVO {
    private Long id;
    private String chatRoomName;
    private String chatRoomType;
    private LocalDateTime chatRoomCreateAt;
    private String chatRoomProfile;
    private Long userId;
}
