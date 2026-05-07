package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class PostLikeVO {
    private Long id;
    private LocalDateTime postLikeCreateAt;
    private Long userId;
    private Long postId;
}
