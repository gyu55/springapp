package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class CertRenewVO {
    private Long id;
    private LocalDateTime certRenewCreateAt;
    private Long testResultId;
}
