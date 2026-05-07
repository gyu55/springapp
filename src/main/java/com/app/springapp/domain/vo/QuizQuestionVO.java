package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class QuizQuestionVO {
    private Long id;
    private String quizQuestionType;
    private String quizQuestionDetail;
    private LocalDateTime quizQuestionCreateAt;
    private Long wordsId;
}
