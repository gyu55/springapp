package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@Data
public class UserAttendanceVO {
    private Long id;
    private LocalDate userAttendanceDate;
    private LocalDateTime userAttendanceAt;
    private Long userId;
}
