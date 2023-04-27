package com.example.exam_online.entity;

import javax.persistence.*;

@MappedSuperclass
public abstract class EntityAudit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	protected Long id;
	
	@Embedded
	protected AuditInfo auditInfo;
	
	public AuditInfo getAuditInfo () {
		if(auditInfo == null) {
			auditInfo = new AuditInfo();
		}
		return auditInfo;
	}
	
	public void setAuditInfo (AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}
}
