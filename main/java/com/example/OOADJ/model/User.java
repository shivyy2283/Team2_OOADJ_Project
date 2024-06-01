package com.example.OOADJ.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "profile")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long userId;
    @Column(name = "uniqueId", unique = true)
    private String uniqueId;
    @Column(name = "userName", length = 30)
    private String userName;
    @Column(name = "email", length = 30)
    private String email;
    @Column(name = "password", length = 30)
    private String password;
    @Column(name = "userType",length = 1)
    private String userType;

    public User()
    {

    }


    public User(Long userId, String uniqueId, String userName, String email, String password, String userType) {
        this.userId = userId;
        this.uniqueId = uniqueId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }



}
