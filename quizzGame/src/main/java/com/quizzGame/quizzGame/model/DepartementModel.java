package com.quizzGame.quizzGame.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "departement")
@Getter
@Setter
public class DepartementModel {

    @Id
    private String number;

    @Column
    private String name;

    @Column
    private String prefecture;

    @Column
    private Integer region;

    

}

