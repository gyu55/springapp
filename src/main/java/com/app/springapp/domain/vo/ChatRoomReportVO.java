package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class ChatRoomReportVO {
    private Long id;
    private String chatRoomReportTitle;
    private String chatRoomReportDetail;
    private LocalDateTime chatRoomReportCreateAt;
    private Long userId;
    private Long chatRoomId;
}
