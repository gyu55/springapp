package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class ReportVO {
    private Long id;
    private String reportTitle;
    private String reportDetail;
    private LocalDateTime reportCreateAt;
    private Long reportTypeId;
    private Long userId;
}
