package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class QuizChoiceVO {
    private Long id;
    private int quizChoiceNumber;
    private int quizChoiceIsCorrect;
    private String quizChoiceDetail;
    private Long quizQuestionId;
}
