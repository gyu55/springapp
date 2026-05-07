package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class UserReportVO {
    private Long id;
    private String userReportTitle;
    private String userReportDetail;
    private LocalDateTime userReportCreateAt;
    private Long userId;
    private Long reportingUserId;
}
