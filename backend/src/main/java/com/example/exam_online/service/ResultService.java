package com.example.exam_online.service;

import com.example.exam_online.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {
    @Autowired
    private ResultRepository resultRepository;

    public double getScore(int idUser, int id) {
        return resultRepository.getScore(idUser, id);
    }
}
