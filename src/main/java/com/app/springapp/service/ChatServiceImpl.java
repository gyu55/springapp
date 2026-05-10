package com.app.springapp.service;

import com.app.springapp.domain.dto.ChatDTO;
import com.app.springapp.domain.dto.request.ChatRequestDTO;
import com.app.springapp.domain.dto.response.ApiResponseDTO;
import com.app.springapp.domain.dto.response.ChatResponseDTO;
import com.app.springapp.domain.dto.response.ChatRoomResponseDTO;
import com.app.springapp.domain.vo.ChatRoomVO;
import com.app.springapp.domain.vo.ChatVO;
import com.app.springapp.repository.ChatDAO;
import com.app.springapp.repository.ChatRoomDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@Transactional(rollbackFor = {Exception.class})
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {
    private final ChatDAO chatDAO;
    private final ChatRoomDAO chatRoomDAO;

    //    채팅방 내 모든 메세지 불러오기
    @Override
    public List<ChatResponseDTO> loadAllChatRoomMessage(Long chatRoomId) {
        return chatDAO.findAll(chatRoomId).stream()
                .map(ChatResponseDTO::from)
                .collect(Collectors.toList());
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

    @Override
    public boolean isUserInChatRoom(ChatRequestDTO chatRequestDTO) {
        ChatVO chatVO = ChatVO.from(chatRequestDTO);
        log.info("테스트 위한 chat vo: {}", chatVO);
        return chatDAO.existByChatRoomIdAndUserId(chatVO) != 0;
    }

    //    모든 채팅방 불러와주기 (페이지 들어왔을 때 보이는 모든 채팅방)
    @Override
    public List<ChatRoomResponseDTO> loadAllChatRoom() {
        List<ChatRoomVO> chatRoomList = chatRoomDAO.findAll();
        return chatRoomList.stream()
                .map(ChatRoomResponseDTO::from)
                .collect(Collectors.toList());
    }
}
