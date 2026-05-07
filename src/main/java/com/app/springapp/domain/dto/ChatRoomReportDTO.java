package com.app.springapp.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "채팅방 신고 DTO")
public class ChatRoomReportDTO {
    @Schema(description = "채팅방 신고 번호", example = "1")
    private Long id;
    @Schema(description = "신고 제목", example = "부적절한 채팅방")
    private String chatRoomReportTitle;
    @Schema(description = "신고 내용", example = "불법 정보가 공유되는 채팅방입니다.")
    private String chatRoomReportDetail;
    @Schema(description = "신고 생성일시", example = "2024-01-01T00:00:00")
    private LocalDateTime chatRoomReportCreateAt;
    @Schema(description = "신고자 유저 번호", example = "1")
    private Long userId;
    @Schema(description = "신고 대상 채팅방 번호", example = "1")
    private Long chatRoomId;
}
