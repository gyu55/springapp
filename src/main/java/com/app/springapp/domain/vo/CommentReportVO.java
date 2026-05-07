package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class CommentReportVO {
    private Long id;
    private String commentReportTitle;
    private String commentReportDetail;
    private LocalDateTime commentReportCreateAt;
    private Long userId;
    private Long commentId;
}
