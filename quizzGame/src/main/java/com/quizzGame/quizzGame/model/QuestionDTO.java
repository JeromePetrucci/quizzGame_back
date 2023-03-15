package com.quizzGame.quizzGame.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionDTO {

    
    private String category;

    private String id;

    private String correctAnswer;

    private String[] incorrectAnswers;

    private String question;

    private String[] tags;

    private String type;

    private String difficulty;

    private String[] regions;

    private Boolean isNiche;
}
