package com.app.springapp.mapper;

import com.app.springapp.domain.vo.ChatRoomVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChatRoomMapper {
//    채팅방 방 목록 불러와주기
    public List<ChatRoomVO> selectAll();
}
