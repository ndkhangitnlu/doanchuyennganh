package com.example.exam_online.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity(name ="question")
@Table
@Getter
@Setter
public class Question extends EntityAudit{
	
	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Answer> answers;
	
}
