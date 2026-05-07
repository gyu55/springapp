package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BadgeVO {
    private Long id;
    private String badgeName;
    private String badgeDetail;
    private String badgeIcon;
}
