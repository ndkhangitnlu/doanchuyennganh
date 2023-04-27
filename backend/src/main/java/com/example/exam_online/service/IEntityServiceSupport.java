package com.example.exam_online.service;

import com.example.exam_online.entity.EntityAudit;

public interface IEntityServiceSupport<T> {
	 T createEntityAudit (T entity);
	 T updateEntityAudit (T entity);
	 void deleteEntityAudit (T entity);
}
