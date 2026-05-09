package com.app.springapp.service;

import com.app.springapp.domain.dto.PostDTO;
import com.app.springapp.repository.PostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostDAO postDAO;

    @Override
    public List<PostDTO> getAllPosts() {
        return postDAO.findAll();
    }
}
