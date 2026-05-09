package com.app.springapp.mapper;

import com.app.springapp.domain.dto.PostDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    public List<PostDTO> selectAll(String postTag);
}
