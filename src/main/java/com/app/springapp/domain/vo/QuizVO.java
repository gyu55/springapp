package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class QuizVO {
    private Long id;
    private String quizTitle;
    private String quizDetail;
    private String quizCategory;
    private String quizThumbnail;
    private LocalDateTime quizCreateAt;
}
