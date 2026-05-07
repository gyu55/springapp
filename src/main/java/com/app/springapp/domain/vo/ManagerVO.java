package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ManagerVO {
    private Long id;
    private String managerName;
    private String managerEmail;
    private String managerPassword;
    private String managerPosition;
}
