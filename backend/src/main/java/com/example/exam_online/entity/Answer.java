package com.example.exam_online.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Table
@Entity(name = "answer")
@Getter
@Setter
public class Answer extends EntityAudit {
	@ManyToOne
	@JoinColumn(name = "question_id")
	private Question question;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "correct")
	@Type(type = "org.hibernate.type.YesNoType")
	private boolean correct;
	
}
