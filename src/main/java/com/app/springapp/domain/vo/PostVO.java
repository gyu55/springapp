package com.app.springapp.domain.vo;

import com.app.springapp.domain.dto.request.PostRequestDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class PostVO {
    private Long id;
    private String postTitle;
    private String postContent;
    private int postReadCount;
    private LocalDateTime postCreateAt;
    private String postTag;
    private Long userId;

    public static PostVO from(PostRequestDTO postRequestDTO) {
        PostVO postVO = new PostVO();
        postVO.setPostTitle(postRequestDTO.getPostTitle());
        postVO.setPostContent(postRequestDTO.getPostContent());
        postVO.setPostTag(postRequestDTO.getPostTag());
        return postVO;
    }
}
