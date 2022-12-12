package com.quizzGame.quizzGame.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "answer")
@Getter
@Setter
public class AnswerModel {

    @Id
    private String id;

    @Column
    private String category;

    @Column
    private String difficulty;

    @Column
    private Boolean answer;
 
}
