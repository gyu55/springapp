package com.app.springapp.repository;

import com.app.springapp.domain.dto.PostDTO;
import com.app.springapp.mapper.PostMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostDAO {

    private final PostMapper postMapper;

//    게시글 전체 불러오는 매서드
    public List<PostDTO> findAll(String postTag) {
        return postMapper.selectAll(postTag);
    }

//    특정 게시글 불러오는 매서드
    public Optional<PostDTO> findById(PostDTO postDTO) {
        return Optional.ofNullable(postMapper.select(postDTO));
    }
}
