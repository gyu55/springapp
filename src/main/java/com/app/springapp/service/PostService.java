package com.app.springapp.service;

import com.app.springapp.domain.dto.PostDTO;
import com.app.springapp.domain.dto.response.PostResponseDTO;
import com.app.springapp.repository.PostDAO;

import java.util.List;

public interface PostService {
//    게시글 전체 리스트 불러오기
    public List<PostResponseDTO> getAllPosts(String postTag);

//    특정 게시글 불러오기
    public PostDTO getPost(PostDTO postDTO);

//    게시글 작성

//    게시글 수정

//    게시글 삭제
}
