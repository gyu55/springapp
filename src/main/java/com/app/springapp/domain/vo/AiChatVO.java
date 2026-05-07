package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class AiChatVO {
    private Long id;
    private String aiChatContent;
    private int aiChatIsUser;
    private LocalDateTime aiChatCreateAt;
    private Long userId;
}
