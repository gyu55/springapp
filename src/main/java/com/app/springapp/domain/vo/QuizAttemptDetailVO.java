package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class QuizAttemptDetailVO {
    private Long id;
    private Long quizAttemptId;
    private Long quizQuestionId;
    private Long quizChoiceId;
    private int quizAttemptDetailIsCorrect;
}
