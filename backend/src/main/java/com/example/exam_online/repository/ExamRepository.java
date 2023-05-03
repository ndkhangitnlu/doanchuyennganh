package com.example.exam_online.repository;

import com.example.exam_online.entity.Exam;
import com.example.exam_online.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
}
