package com.app.springapp.repository;

import com.app.springapp.domain.dto.PostDTO;
import com.app.springapp.mapper.PostMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@RequiredArgsConstructor
public class PostDAO {

    private final PostMapper postMapper;

//    게시글 전체 불러오는 매서드
    public List<PostDTO> findAll() {
        return postMapper.selectAll();
    }
}
