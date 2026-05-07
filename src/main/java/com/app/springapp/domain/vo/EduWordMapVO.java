package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class EduWordMapVO {
    private Long id;
    private Long eduId;
    private Long wordsId;
}
