package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class SocialUserVO {
    private Long id;
    private String socialUserProviderId;
    private String socialUserProvider;
    private Long userId;
}
