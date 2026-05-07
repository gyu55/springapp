package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class TodayWordResultVO {
    private Long id;
    private LocalDateTime todayWordResultCreateAt;
    private int todayWordResultIsCorrect;
    private Long todayWordDetailId;
    private Long quizChoiceId;
}
