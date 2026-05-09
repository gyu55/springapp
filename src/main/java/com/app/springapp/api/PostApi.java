package com.app.springapp.api;

import com.app.springapp.domain.dto.response.ApiResponseDTO;
import com.app.springapp.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostApi {
    private final PostService postService;
//    전체 포스트 가져오는거 정의

    @GetMapping("")
    public ResponseEntity<ApiResponseDTO> getAllPosts(
            @RequestParam(required = false, defaultValue = "") String postTag
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ApiResponseDTO.of(true, "게시글 목록 불러오기 성공", postService.getAllPosts(postTag)));
    }

//    특정 게시글 가져오기

}
