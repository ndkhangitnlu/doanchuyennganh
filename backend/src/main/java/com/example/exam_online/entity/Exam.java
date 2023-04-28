package com.example.exam_online.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table
@Entity(name ="exams")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Exam extends EntityAudit {
	
	@ManyToOne
	@JoinColumn(name = "questionnaire", referencedColumnName = "id")
	private Questionnaire questionnaire;
}
