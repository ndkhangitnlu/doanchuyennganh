package com.example.exam_online.entity;

import lombok.AllArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table
@Entity(name = "room")
@AllArgsConstructor
public class Room extends EntityAudit {
	@Column(name = "invitation_code")
	private String code;
	
	@Column(name ="name")
	private String name;
	@Column(name = "startAt")
	private LocalDateTime startAt;
	//This is time to calculate end time
	@Column(name = "time")
	private int seconds;
	
	public Room() {
		code = generateCode();
	}
	private String generateCode() {
		return RandomStringUtils.randomAlphabetic(4);
	}
}
