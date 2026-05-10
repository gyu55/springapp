package com.app.springapp.mapper;

import com.app.springapp.domain.dto.PostDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PostMapper {
//    게시글 목록 가져오기
    public List<PostDTO> selectAll(Map<String, Object> filters);

//    특정 게시글의 정보 (상세정보) 불러오기
    public PostDTO select(PostDTO postDTO);

//    유저 프로필 에서 유저가 작성한 게시글 목록
    public List<PostDTO> selectByUserId(Map<String, Object> filters);

//    게시글 전체 갯수 (페이지네이션 용)
    public int selectCount(String postTag);

//    유저 작성한 게시글 전체 갯수
    public int countByUserId(Long userId);
}
