package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@Data
public class TodayWordVO {
    private Long id;
    private LocalDate todayWordDate;
    private LocalDateTime todayWordCreateAt;
    private Long userId;
}
