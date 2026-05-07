package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class TestVO {
    private Long id;
    private String testTitle;
    private String testDetail;
    private LocalDateTime testDate;
    private int testLimit;
    private String testLocation;
    private int testPrice;
    private int testIsDeleted;
}
