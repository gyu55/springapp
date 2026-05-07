package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "유저 설정 DTO")
public class SettingDTO {
    @Schema(description = "설정 번호", example = "1")
    private Long id;
    @Schema(description = "댓글 알림 설정", example = "0")
    private int settingReply;
    @Schema(description = "좋아요 알림 설정", example = "0")
    private int settingGood;
    @Schema(description = "게시판 알림 설정", example = "0")
    private int settingBulletin;
    @Schema(description = "학습 알림 설정", example = "0")
    private int settingStudy;
    @Schema(description = "이메일 푸시 설정", example = "0")
    private int settingEmailPush;
    @Schema(description = "게시글 공개 설정", example = "0")
    private int settingPostOpen;
    @Schema(description = "기본 수어 설정", example = "0")
    private int settingSignDefault;
    @Schema(description = "점자 변환 설정", example = "0")
    private int settingBrailleTranslate;
    @Schema(description = "자동 스크롤 설정", example = "0")
    private int settingAutoScroll;
    @Schema(description = "푸시 알림 설정", example = "0")
    private int settingPushNotify;
    @Schema(description = "멘션 알림 설정", example = "0")
    private int settingMentionNotify;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;
}
