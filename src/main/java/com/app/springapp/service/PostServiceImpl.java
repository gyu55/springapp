package com.app.springapp.service;

import com.app.springapp.domain.dto.PostDTO;
import com.app.springapp.domain.dto.response.PostResponseDTO;
import com.app.springapp.exception.PostException;
import com.app.springapp.repository.PostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostDAO postDAO;

    @Override
    public List<PostResponseDTO> getAllPosts(String postTag) {
        return postDAO.findAll(postTag).stream()
                .map(PostResponseDTO::from)
                .collect(Collectors.toList());
    }

    @Override
    public PostDTO getPost(PostDTO postDTO) {
        return postDAO.findById(postDTO).orElseThrow(() -> {
           throw new PostException(HttpStatus.BAD_REQUEST, "포스트 불러오기 실패");
        });
    }
}
