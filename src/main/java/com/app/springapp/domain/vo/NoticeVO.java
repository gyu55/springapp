package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class NoticeVO {
    private Long id;
    private String noticeTitle;
    private String noticeContent;
    private LocalDateTime noticeCreateAt;
    private Long managerId;
}
