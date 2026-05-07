package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "공지사항 등록 요청 DTO")
public class NoticeRequestDTO {
    @Schema(description = "공지사항 제목", example = "서비스 점검 안내", required = true)
    private String noticeTitle;
    @Schema(description = "공지사항 내용", example = "2024년 1월 1일 서비스 점검이 예정되어 있습니다.", required = true)
    private String noticeContent;
    @Schema(description = "관리자 번호", example = "1", required = true)
    private Long managerId;
}
