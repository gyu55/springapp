package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class QuizEduVO {
    private Long id;
    private Long quizId;
    private Long quizQuestionId;
}
