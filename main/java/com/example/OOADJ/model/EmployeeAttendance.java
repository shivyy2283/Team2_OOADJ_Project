package com.example.OOADJ.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "attendance")
public class EmployeeAttendance
{
    @Id
    @Column(name="user_id")
    public String user_id;
    @Column(name="years_of_service")
    private String years_of_service;
    @Column(name="current_dept")
    private String current_dept;
    @Column(name="no_days_attended_this_year")
    private String no_days_attended_this_year;
    @Column(name="total_no_of_working_days")
    private int total_no_of_working_days;
    @Column(name="remaining_leave_for_the_year")
    private String remaining_leave_for_the_year;
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getYears_of_service() {
        return years_of_service;
    }
    public void setYears_of_service(String years_of_service) {
        this.years_of_service = years_of_service;
    }
    public String getCurrent_dept() {
        return current_dept;
    }
    public void setCurrent_dept(String current_dept) {
        this.current_dept = current_dept;
    }
    public String getNo_days_attended_this_year() {
        return no_days_attended_this_year;
    }
    public void setNo_days_attended_this_year(String no_days_attended_this_year) {
        this.no_days_attended_this_year = no_days_attended_this_year;
    }
    public int getTotal_no_of_working_days() {
        return total_no_of_working_days;
    }
    public void setTotal_no_of_working_days(int total_no_of_working_days) {
        this.total_no_of_working_days = total_no_of_working_days;
    }
    public String getRemaining_leave_for_the_year() {
        return remaining_leave_for_the_year;
    }
    public void setRemaining_leave_for_the_year(String remaining_leave_for_the_year) {
        this.remaining_leave_for_the_year = remaining_leave_for_the_year;
    }


}

