package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class PostReportVO {
    private Long id;
    private String postReportTitle;
    private String postReportDetail;
    private LocalDateTime postReportCreateAt;
    private Long userId;
    private Long postId;
}
