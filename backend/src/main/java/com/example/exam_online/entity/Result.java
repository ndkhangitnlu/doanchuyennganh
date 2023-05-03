package com.example.exam_online.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table
@Entity(name = "results")
@Getter
@Setter
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResult;
    @Column(name = "total_score")
    private double totalScore;
    @Column(name = "id_user")
    private int idUser;
    @Column(name = "id_exam")
    private int idExam;
}
