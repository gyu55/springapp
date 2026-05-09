package com.app.springapp.service;

import com.app.springapp.domain.dto.ChatDTO;
import com.app.springapp.domain.dto.request.ChatRequestDTO;
import com.app.springapp.domain.dto.response.ApiResponseDTO;
import com.app.springapp.domain.vo.ChatVO;
import com.app.springapp.repository.ChatDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = {Exception.class})
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {
    private final ChatDAO chatDAO;

//    채팅방 내 모든 메세지 불러오기
    @Override
    public List<ChatDTO> loadAllChatRoomMessage(Long chatRoomId) {
        return chatDAO.findAll(chatRoomId);
    }

//    메세지 작성
    @Override
    public ApiResponseDTO writeChatMessage(ChatRequestDTO chatRequestDTO) {
//        DTO 를 VO 로 변환 한 뒤에 작성 해야함
        try {
            chatDAO.save(ChatVO.from(chatRequestDTO));
            return ApiResponseDTO.of(true, "메세지 전송 성공");
        } catch (Exception e) {
            return ApiResponseDTO.of(false, "메세지 전송 실패");
        }
    }
}
