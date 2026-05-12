package com.app.springapp.service;

import com.app.springapp.domain.dto.PostDTO;
import com.app.springapp.domain.dto.request.PostRequestDTO;
import com.app.springapp.domain.dto.response.PostResponseDTO;
import com.app.springapp.repository.PostDAO;

import java.util.List;
import java.util.Map;

public interface PostService {
//    게시글 전체 리스트 불러오기
    public Map<String, Object> getAllPosts(Map<String, Object> filters);

//    특정 게시글 불러오기
    public PostDTO getPost(PostDTO postDTO);

//    유저가 작성 한 게시글들 불러오기
    public Map<String, Object> getUserPosts(Long userId, Map<String, Object> filters);

//    게시글 작성
    public void writePost(Long userId, PostRequestDTO postRequestDTO);

//    게시글 수정

//    게시글 삭제
}
