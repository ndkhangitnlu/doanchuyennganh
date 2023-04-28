package com.example.exam_online.service;

import com.example.exam_online.config.SecurityHelper;
import com.example.exam_online.entity.EntityAudit;
import com.example.exam_online.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public abstract class AbstractEntityAuditService<T extends EntityAudit> implements IEntityServiceSupport<T>{
	protected abstract JpaRepository<T, Long> getEntityRepository();
	
	@Override
	public T createEntityAudit (T entity) {
		User user = SecurityHelper.currentUser();
		//entity.getAuditInfo().setCreateDate(LocalDateTime.now());
		//entity.getAuditInfo().setCreateUserId(user.getIdUser());
		return getEntityRepository().save(entity);
	};
	
	@Override
	public T updateEntityAudit (T entity) {
		User user = SecurityHelper.currentUser();
		entity.getAuditInfo().setChangeDate(LocalDateTime.now());
		entity.getAuditInfo().setChangeUserId(user.getIdUser());
		return getEntityRepository().save(entity);
	}
	
	@Override
	public void deleteEntityAudit (T entity) {
		getEntityRepository().delete(entity);
	}
}
