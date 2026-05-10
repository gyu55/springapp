package com.app.springapp.service;

import com.app.springapp.domain.dto.PostDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

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
        Map<String,Object> map1 = new HashMap<>();
        Map<String,Object> map2 = new HashMap<>();

        map1.put("page",2);
//        postService.getAllPosts(map1).stream()
//                .forEach((post) -> log.info(post.toString()));
        Map<String,Object> result1 = postService.getAllPosts(map1);
        result1.forEach((k,v)->{
           log.info("Key: {}", k);
           log.info("Value: {}", v);
        });

        map2.put("page",1);
        map2.put("postTag","자유게시판");

//        log.info("자유게시판 불러오기");
//        postService.getAllPosts(map2).stream()
//                .forEach((post) -> log.info(post.toString()));
    }

//    단위 개시글 불러오기 테스트
    @Test
    public void getPostTest(){
        PostDTO  postDTO = new PostDTO();
        postDTO.setId(99L);
//        postDTO.setUserId(2L); // 좋아요 한 해
        postDTO.setUserId(3L); // 좋아요 x

        log.info(postService.getPost(postDTO).toString());
    }

//    유저의 특정 게시글 불러오게 하기
    @Test
    public void getUserPostsTest(){
        Map<String,Object> req = new HashMap<>();
        req.put("page",1);

        Map<String, Object> result = postService.getUserPosts(5L, req);

        result.forEach((k,v)->{
            log.info("유저 게시글 Key: {}", k);
            log.info("유저 게시글 Value: {}", v);
        });
    }
}
