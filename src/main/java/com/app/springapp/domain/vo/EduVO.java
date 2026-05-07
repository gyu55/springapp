package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class EduVO {
    private Long id;
    private String eduTitle;
    private String eduDetail;
    private int eduDia;
    private int eduIsDeleted;
}
