package com.app.springapp.mapper;

import com.app.springapp.domain.vo.ChatMemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChatMemberMapper {
    public void insert(ChatMemberVO chatMemberVO);
}
