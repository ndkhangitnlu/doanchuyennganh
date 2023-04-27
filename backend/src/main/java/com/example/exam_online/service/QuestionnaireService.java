package com.example.exam_online.service;

import com.example.exam_online.entity.Questionnaire;
import com.example.exam_online.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionnaireService extends AbstractEntityAuditService<Questionnaire> implements IQuestionnaireService<Questionnaire>{
	@Autowired
	QuestionnaireRepository questionnaireRepository;
	@Override
	protected JpaRepository<Questionnaire, Long> getEntityRepository () {
		return questionnaireRepository;
	}
}
