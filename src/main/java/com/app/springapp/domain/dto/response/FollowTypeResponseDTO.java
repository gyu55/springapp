package com.app.springapp.domain.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.app.springapp.domain.dto.FollowTypeDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(description = "팔로우 타입 응답 DTO")
public class FollowTypeResponseDTO {
    @Schema(description = "팔로우 타입 번호", example = "1")
    private Long id;
    @Schema(description = "팔로우 타입 이름", example = "일반 팔로우")
    private String followTypeName;
    @Schema(description = "팔로우 타입 설명", example = "일반 팔로우 관계입니다.")
    private String followTypeDetail;

    public static FollowTypeResponseDTO from(FollowTypeDTO dto) {
        FollowTypeResponseDTO res = new FollowTypeResponseDTO();
        res.setId(dto.getId());
        res.setFollowTypeName(dto.getFollowTypeName());
        res.setFollowTypeDetail(dto.getFollowTypeDetail());
        return res;
    }
}
