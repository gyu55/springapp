package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class SettingVO {
    private Long id;
    private int settingReply;
    private int settingGood;
    private int settingBulletin;
    private int settingStudy;
    private int settingEmailPush;
    private int settingPostOpen;
    private int settingSignDefault;
    private int settingBrailleTranslate;
    private int settingAutoScroll;
    private int settingPushNotify;
    private int settingMentionNotify;
    private Long userId;
}
