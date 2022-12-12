package com.quizzGame.quizzGame.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Id;

@Entity
@Table(name = "question")
@Getter
@Setter
public class QuestionModel {

    @Column
    private String category;

    @Id
    @Column
    private String id_question;

    @Column
    private String correct_answer;

    @Column
    private String[] incorrect_answers;

    @Column
    private String question;

    @Column
    private String difficulty;

    public QuestionModel(){}

    public QuestionModel(QuestionDTO newQuestion){
        super();
        this.category=newQuestion.getCategory();
        this.id_question=newQuestion.getId();
        this.correct_answer=newQuestion.getCorrectAnswer();
        this.incorrect_answers=newQuestion.getIncorrectAnswers();
        this.question=newQuestion.getQuestion();
        this.difficulty=newQuestion.getDifficulty();
    }


}
