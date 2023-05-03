package com.example.exam_online.service;

import com.example.exam_online.entity.Exam;
import com.example.exam_online.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService {
    @Autowired
    private ExamRepository examRepository;

    public Exam findById(Long examId) {
        return examRepository.findById(examId).orElse(null);
    }
}
