package com.app.springapp.repository;

import com.app.springapp.domain.dto.PostDTO;
import com.app.springapp.mapper.PostMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostDAO {

    private final PostMapper postMapper;

//    게시글 전체 불러오는 매서드
    public List<PostDTO> findAll(Map<String, Object> filters) {
        return postMapper.selectAll(filters);
    }

//    특정 게시글 불러오는 매서드
    public Optional<PostDTO> findById(PostDTO postDTO) {
        return Optional.ofNullable(postMapper.select(postDTO));
    }

//    불러올 게시글의 전체 갯수
    public int findCount(String postTag) {
        return postMapper.selectCount(postTag);
    }
}
