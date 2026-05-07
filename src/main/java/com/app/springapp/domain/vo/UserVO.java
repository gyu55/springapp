package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class UserVO {
    private Long id;
    private String userName;
    private String userNickname;
    private String userIntro;
    private String userJob;
    private String userAddress;
    private String userEmail;
    private String userPhoneNum;
    private String userPassword;
    private int userExp;
    private String userProfile;
    private LocalDateTime userCreateAt;
}
