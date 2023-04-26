package com.example.exam_online.repository;

import com.example.exam_online.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByidUser(int id);

    User findByUsername(String username);
}
