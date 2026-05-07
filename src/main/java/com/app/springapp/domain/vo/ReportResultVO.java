package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class ReportResultVO {
    private Long id;
    private LocalDateTime reportResultAt;
    private String reportResultTitle;
    private String reportResultDetail;
    private Long reportId;
    private Long managerId;
}
