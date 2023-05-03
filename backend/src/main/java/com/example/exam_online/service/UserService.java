package com.example.exam_online.service;

import com.example.exam_online.dto.CustomUserDetails;
import com.example.exam_online.entity.User;
import com.example.exam_online.exception.CustomException;
import com.example.exam_online.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    public User findById(Long id) throws CustomException {
        Optional<User> user = userRepository.findById(id);
        return user.map(u -> u
        ).orElseThrow(() -> new CustomException(HttpStatus.NOT_FOUND, "not found user by id"));
    }
    @Transactional
    public UserDetails loadUserById(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new UsernameNotFoundException("User not found with id : " + userId)
        );

        return new CustomUserDetails(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new CustomUserDetails(user);
    }

    public List<User> findUserByIds(List<Integer> userIds) {
        return userRepository.findAllById(userIds);
    }
}
