package com.app.springapp.api;

import com.app.springapp.domain.dto.ChatDTO;
import com.app.springapp.domain.dto.response.ApiResponseDTO;
import com.app.springapp.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/chats")
public class ChatApi {

    private final ChatService chatService;

    @GetMapping("{chatRoomId}")
    public ResponseEntity<ApiResponseDTO> loadAllChatRoomMessage(
            @PathVariable Long chatRoomId
    ) {
        List<ChatDTO> chats = chatService.loadAllChatRoomMessage(chatRoomId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ApiResponseDTO.of(true, "메세지 불러오기 성공", chats));
    }
}
