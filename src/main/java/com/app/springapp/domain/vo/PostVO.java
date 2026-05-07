package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class PostVO {
    private Long id;
    private String postTitle;
    private String postContent;
    private int postReadCount;
    private LocalDateTime postCreateAt;
    private String postTag;
    private Long userId;
}
