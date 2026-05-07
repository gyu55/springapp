package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "알림 DTO")
public class NotificationDTO {
    @Schema(description = "알림 번호", example = "1")
    private Long id;
    @Schema(description = "알림 타입", example = "댓글")
    private String notificationType;
    @Schema(description = "알림 이름", example = "새 댓글 알림")
    private String notificationName;
    @Schema(description = "알림 내용", example = "홍길동님이 댓글을 남겼습니다.")
    private String notificationContent;
    @Schema(description = "알림 URL", example = "/post/1")
    private String notificationUrl;
    @Schema(description = "읽음 여부 (0: 미읽음, 1: 읽음)", example = "0")
    private int notificationIsRead;
    @Schema(description = "읽은 일시", example = "2024-01-01T00:00:00")
    private LocalDateTime notificationReadAt;
    @Schema(description = "삭제 여부 (0: 미삭제, 1: 삭제)", example = "0")
    private int notificationIsDeleted;
    @Schema(description = "알림 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime notificationCreateAt;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;
}
