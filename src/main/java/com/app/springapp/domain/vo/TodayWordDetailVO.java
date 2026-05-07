package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TodayWordDetailVO {
    private Long id;
    private Long todayWordId;
    private Long quizQuestionId;
}
