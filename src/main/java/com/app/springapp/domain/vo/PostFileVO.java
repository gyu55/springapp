package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class PostFileVO {
    private Long id;
    private String postFileDir;
    private String postFileType;
    private LocalDateTime postFileCreateAt;
    private Long postId;
}
