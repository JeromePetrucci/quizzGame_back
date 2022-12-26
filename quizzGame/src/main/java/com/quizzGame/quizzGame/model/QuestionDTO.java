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
    
    public QuestionDTO(String category, String id, String correctAnswer, String[] incorrectAnswers, String question, String[] tags, 
    String type, String difficulty, String[] regions, Boolean isNiche) {
        this.category = category;
        this.id=id;
        this.correctAnswer=correctAnswer;
        this.incorrectAnswers=incorrectAnswers;
        this.question=question;
        this.tags=tags;
        this.type=type;
        this.difficulty=difficulty;
        this.regions=regions;
        this.isNiche=isNiche;

    }
}
