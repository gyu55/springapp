package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ReportTypeVO {
    private Long id;
    private String reportTypeName;
    private String reportTypeDetail;
}
