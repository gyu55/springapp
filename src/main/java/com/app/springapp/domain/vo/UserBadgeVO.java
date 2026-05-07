package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class UserBadgeVO {
    private Long id;
    private LocalDateTime userBadgeCreateAt;
    private Long userId;
    private Long badgeId;
}
