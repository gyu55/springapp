package com.app.springapp.service;

import org.springframework.stereotype.Service;

@Service
public class CommunityAuthServiceImpl implements CommunityAuthService {
    @Override
    public Long getUserId() {
        return 3L;
    }
}
