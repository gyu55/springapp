package com.app.springapp.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// 커뮤니티 서비스 중 포스트 관련 서비스 테스트 위한 단테 파일

@SpringBootTest
@Slf4j
public class PostServiceTest {

    @Autowired
    private PostService postService;

//    게시글 리스트 전체 불러오는 서비스 테스트
    @Test
    public void getAllPostsTest(){
        log.info("전체 게시글 불러오는 관점");
        postService.getAllPosts("").stream()
                .forEach((post) -> log.info(post.toString()));

        log.info("자유게시판 불러오기");
        postService.getAllPosts("자유게시판").stream()
                .forEach((post) -> log.info(post.toString()));
    }
}
