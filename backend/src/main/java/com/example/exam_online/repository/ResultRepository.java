package com.example.exam_online.repository;

import com.example.exam_online.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer> {
    @Query("SELECT r.totalScore FROM results r WHERE r.idUser = ?1 AND r.idExam = ?2")
    double getScore( int idUser, int id);
}
