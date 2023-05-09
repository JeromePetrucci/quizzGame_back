package com.quizzGame.quizzGame.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "state")
@Getter
@Setter
public class UsStateModel {
    
    @Id
    private String code;

    @Column
    private String state;

    @Column
    private String capital;

}
