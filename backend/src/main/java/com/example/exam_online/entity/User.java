package com.example.exam_online.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String email;
    private String username;
    private String password;
    private boolean isActive;
    private String activeCode;
    private String role;
}
