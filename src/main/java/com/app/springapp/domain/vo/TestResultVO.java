package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TestResultVO {
    private Long id;
    private int testResultPoint;
    private Long testApplyId;
}
