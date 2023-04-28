package com.example.exam_online.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "questionnaires")
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Questionnaire extends EntityAudit {
	@Column(name ="code", unique = true)
	private String code;
	@OneToMany(mappedBy = "questionnaire", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Question> questions = new HashSet<>();
}
