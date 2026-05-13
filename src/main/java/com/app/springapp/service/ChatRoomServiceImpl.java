package com.app.springapp.service;

import com.app.springapp.domain.dto.request.ChatMemberRequestDTO;
import com.app.springapp.domain.dto.request.ChatRequestDTO;
import com.app.springapp.domain.vo.ChatMemberVO;
import com.app.springapp.repository.ChatMemberDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = {Exception.class})
@RequiredArgsConstructor
public class ChatRoomServiceImpl implements ChatRoomService {
    private final ChatMemberDAO chatMemberDAO;
    private final CommunityAuthService communityAuthService;

    //    채팅방 방 생성
    @Override
    public void createChatRoom(ChatRequestDTO chatRequestDTO) {

    }

//    유저가 채팅방에 참여
    @Override
    public void joinChatRoom(Long chatRoomId) {
        Long userId = communityAuthService.getUserId();
        ChatMemberVO chatMemberVO = new ChatMemberVO();
        chatMemberVO.setChatRoomId(chatRoomId);
        chatMemberVO.setUserId(userId);

        chatMemberDAO.save(chatMemberVO);
    }
}
