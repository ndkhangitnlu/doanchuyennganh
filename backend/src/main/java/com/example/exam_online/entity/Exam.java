package com.example.exam_online.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.ConstraintMode.NO_CONSTRAINT;
import static javax.persistence.ConstraintMode.PROVIDER_DEFAULT;

@Table
@Entity(name ="exams")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Exam extends EntityAudit {
	@ManyToOne
	@JoinColumn(name = "questionnaire_id", referencedColumnName = "id", foreignKey=@ForeignKey(NO_CONSTRAINT))
	private Questionnaire questionnaire;

}
