package com.example.OOADJ.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "userid")
    private String userid;

    @Column(name = "Name")
    private String name;

    @Column(name = "email_id")
    private String email_id;

    @Column(name = "department")
    private String department;

    @Column(name = "dob")
    private String dob; // Changed to String

    @Column(name = "position")
    private String position;

    @Column(name = "userPhone")
    private String userPhone; // Changed to String

    @Column(name = "date_of_joining")
    private String date_of_joining;

    @Column(name = "address")
    private String address;

    @Column(name = "user_type")
    private boolean user_type;

    // Getters and setters for all fields

    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getEmail_id() {
        return email_id;
    }
    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department= department;
    }

    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getDate_of_joining() {
        return date_of_joining;
    }
    public void setDate_of_joining(String date_of_joining) {
        this.date_of_joining = date_of_joining;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isUser_type() {
        return user_type;
    }
    public void setUser_type(boolean user_type) {
        this.user_type = user_type;
    }
}
