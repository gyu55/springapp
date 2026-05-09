package com.app.springapp.api;

import com.app.springapp.domain.dto.PostDTO;
import com.app.springapp.domain.dto.response.ApiResponseDTO;
import com.app.springapp.service.PostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostApi {
    private final PostService postService;

//    전체 포스트 가져오는거 정의
    @GetMapping("")
    @Operation(summary = "포스트 로드", description = "게시글 전체 로드")
    @ApiResponse(responseCode = "200", description = "게시글 목록 로드 성공")
    @ApiResponse(responseCode = "400", description = "게시글 목록 로드 실패 (잘못된 요청)")
    @Parameter(
            name = "postTag",
            description = "게시글 타입 태그",
            example = "자유게시판",
            required = false,
            in = ParameterIn.QUERY,
            schema = @Schema(type = "String")
    )
    public ResponseEntity<ApiResponseDTO> getAllPosts(
            @RequestParam(required = false, defaultValue = "") String postTag
    ){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ApiResponseDTO.of(true, "게시글 목록 불러오기 성공", postService.getAllPosts(postTag)));
    }

//    특정 게시글 가져오기
    @GetMapping("/{id}")
    @Operation(summary = "특정 포스트 로드", description = "특정 게시글 상세정보 불러오기")
    @ApiResponse(responseCode = "200", description = "게시글 정보 로드 성공")
    @ApiResponse(responseCode = "400", description = "게시글 정보 로드 실패 (잘못된 요청)")
    @Parameter(
            name = "id",
            description = "게시글 번호",
            example = "1",
            required = true,
            in = ParameterIn.PATH,
            schema = @Schema(type = "number")
    )
    public ResponseEntity<ApiResponseDTO> getPostById(
            @PathVariable Long id
    ) {
        // userId 는 일단 없다고 가정 (있다면 추후 넣기)
        PostDTO postDTO = new PostDTO();
        postDTO.setId(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ApiResponseDTO.of(true, "포스트 로드 성공", postService.getPost(postDTO)));
    }
}
