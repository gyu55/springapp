package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class WordStudyVO {
    private Long id;
    private LocalDateTime wordStudyCreateAt;
    private LocalDateTime wordStudyUpdateAt;
    private int wordStudyIsCompleted;
    private Long eduWordMapId;
    private Long userId;
}
