package com.app.springapp.api;

import com.app.springapp.domain.dto.request.ChatRoomRequestDTO;
import com.app.springapp.domain.dto.response.ApiResponseDTO;
import com.app.springapp.service.ChatRoomService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/chat-rooms")
public class ChatRoomApi {

    private final ChatRoomService chatRoomService;

    //    채팅방 생성
    @PostMapping("")
    @Operation(description = "채팅방 생성 작성")
    @ApiResponse(responseCode = "201", description = "채팅방 생성 성공")
    @ApiResponse(responseCode = "401", description = "채팅방 생성 권한이 없습니다.")
    public ResponseEntity<ApiResponseDTO> createChatRoom(
            @RequestBody ChatRoomRequestDTO chatRoomRequestDTO
    ){
        chatRoomService.createChatRoom(chatRoomRequestDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(ApiResponseDTO.of(true, "채팅방 생성 성공"));
    }
}
