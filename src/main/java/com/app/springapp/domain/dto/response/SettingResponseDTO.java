package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.SettingDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "유저 설정 응답 DTO")
public class SettingResponseDTO {
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

    public static SettingResponseDTO from(SettingDTO dto) {
        SettingResponseDTO res = new SettingResponseDTO();
        res.setId(dto.getId());
        res.setSettingReply(dto.getSettingReply());
        res.setSettingGood(dto.getSettingGood());
        res.setSettingBulletin(dto.getSettingBulletin());
        res.setSettingStudy(dto.getSettingStudy());
        res.setSettingEmailPush(dto.getSettingEmailPush());
        res.setSettingPostOpen(dto.getSettingPostOpen());
        res.setSettingSignDefault(dto.getSettingSignDefault());
        res.setSettingBrailleTranslate(dto.getSettingBrailleTranslate());
        res.setSettingAutoScroll(dto.getSettingAutoScroll());
        res.setSettingPushNotify(dto.getSettingPushNotify());
        res.setSettingMentionNotify(dto.getSettingMentionNotify());
        res.setUserId(dto.getUserId());
        return res;
    }
}
