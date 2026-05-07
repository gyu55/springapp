package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class EduCertVO {
    private Long id;
    private LocalDateTime eduCertCreateAt;
    private Long eduId;
    private Long userId;
}
