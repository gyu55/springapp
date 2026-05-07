package com.app.springapp.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
@Data
public class QuizAttemptVO {
    private Long id;
    private LocalDateTime quizAttemptCreateAt;
    private int quizAttemptScore;
    private int quizAttemptTotalCount;
    private Long userId;
    private Long quizId;
}
