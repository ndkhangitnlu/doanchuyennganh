package com.example.exam_online.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class AuditInfo {
	@Column(name = "create_user_id")
	private Integer createUserId;
	@Column(name = "createDate")
	private LocalDateTime createDate;
	@Column(name = "change_user_id")
	private Integer changeUserId;
	@Column(name = "changeDate")
	private LocalDateTime changeDate;
}
