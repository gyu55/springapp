package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class FollowVO {
    private Long id;
    private LocalDateTime followCreateAt;
    private String followType;
    private Long followTypeId;
    private Long followerId;
    private Long followingId;
}
