package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class NotificationVO {
    private Long id;
    private String notificationType;
    private String notificationName;
    private String notificationContent;
    private String notificationUrl;
    private int notificationIsRead;
    private LocalDateTime notificationReadAt;
    private int notificationIsDeleted;
    private LocalDateTime notificationCreateAt;
    private Long userId;
}
