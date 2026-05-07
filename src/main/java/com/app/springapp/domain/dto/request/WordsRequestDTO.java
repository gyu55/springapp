package com.app.springapp.domain.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "수어 단어 등록 요청 DTO")
public class WordsRequestDTO {
    @Schema(description = "단어 제목", example = "안녕하세요", required = true)
    private String wordsTitle;
    @Schema(description = "단어 설명", example = "인사할 때 사용하는 수어입니다.", required = true)
    private String wordsDetail;
    @Schema(description = "단어 이미지", example = "default.jpg")
    private String wordsImage;
    @Schema(description = "단어 타입", example = "인사", required = true)
    private String wordsType;
    @Schema(description = "수어 영상 번호", example = "1", required = true)
    private Long eduVideoId;
}
