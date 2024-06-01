package com.example.OOADJ.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class PEmployee {

    @Id
    @Column(name = "userid", length = 255, nullable = false)
    private String userId;

    @Column(name = "Name", length = 255, nullable = false)
    private String username;

    @Column(name = "position", length = 255, nullable = false)
    private String position;



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
