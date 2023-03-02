package com.quizzGame.quizzGame.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "capitals")
@Getter
@Setter
public class CapitalModel {

    @Id
    private Integer id;

    @Column
    private String country;

    @Column
    private String capital;

    @Column
    private String region;

    @Column
    private String code;

}
