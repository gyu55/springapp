package com.app.springapp.mapper;

import com.app.springapp.domain.dto.PostDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
//    게시글 목록 가져오기
    public List<PostDTO> selectAll(String postTag);

//    특정 게시글의 정보 (상세정보) 불러오기
    public PostDTO select(PostDTO postDTO);
}
