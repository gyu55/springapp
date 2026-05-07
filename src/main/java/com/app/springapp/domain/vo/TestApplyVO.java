package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class TestApplyVO {
    private Long id;
    private LocalDateTime testApplyAt;
    private Long userId;
    private Long testId;
}
