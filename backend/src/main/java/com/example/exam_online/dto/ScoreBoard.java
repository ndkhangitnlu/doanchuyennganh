package com.example.exam_online.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScoreBoard {
    private String username;
    private int rightAnswer;
    private int totalQuestion;
    private double score;
}
