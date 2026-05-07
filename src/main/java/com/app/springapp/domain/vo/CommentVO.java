package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class CommentVO {
    private Long id;
    private String commentContent;
    private LocalDateTime commentCreateAt;
    private Long postId;
    private Long userId;
    private Long commentId;
}
