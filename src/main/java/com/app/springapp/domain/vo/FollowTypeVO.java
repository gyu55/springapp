package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class FollowTypeVO {
    private Long id;
    private String followTypeName;
    private String followTypeDetail;
}
