package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.UserAttendanceDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@Data
@Schema(description = "유저 출석 응답 DTO")
public class UserAttendanceResponseDTO {
    @Schema(description = "출석 번호", example = "1")
    private Long id;
    @Schema(description = "출석 날짜", example = "2024-01-01")
    private LocalDate userAttendanceDate;
    @Schema(description = "출석 일시", example = "2024-01-01T00:00:00")
    private LocalDateTime userAttendanceAt;
    @Schema(description = "유저 번호", example = "1")
    private Long userId;

    public static UserAttendanceResponseDTO from(UserAttendanceDTO dto) {
        UserAttendanceResponseDTO res = new UserAttendanceResponseDTO();
        res.setId(dto.getId());
        res.setUserAttendanceDate(dto.getUserAttendanceDate());
        res.setUserAttendanceAt(dto.getUserAttendanceAt());
        res.setUserId(dto.getUserId());
        return res;
    }
}
