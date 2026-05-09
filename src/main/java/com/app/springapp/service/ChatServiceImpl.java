package com.app.springapp.service;

import com.app.springapp.domain.dto.ChatDTO;
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

    @Override
    public List<ChatDTO> loadAllChatRoomMessage(Long chatRoomId) {
        return chatDAO.findAll(chatRoomId);
    }
}
