package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class UserBlockVO {
    private Long id;
    private LocalDateTime userBlockCreateAt;
    private Long blockerId;
    private Long blockingId;
}
