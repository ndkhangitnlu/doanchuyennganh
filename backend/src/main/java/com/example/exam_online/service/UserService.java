package com.example.exam_online.service;

import com.example.exam_online.entity.User;
import com.example.exam_online.exception.CustomException;
import com.example.exam_online.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findById(int id) throws CustomException {
        Optional<User> user = userRepository.findById(id);
        return user.map(u -> u
        ).orElseThrow(() -> new CustomException(HttpStatus.NOT_FOUND, "not found user by id"));
    }
}
