package com.example.exam_online.repository;

import com.example.exam_online.entity.Questionnaire;
import com.example.exam_online.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Long> {
}
