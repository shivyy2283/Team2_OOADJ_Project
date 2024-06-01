package com.example.OOADJ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.OOADJ.model.Employee;

import com.example.OOADJ.model.EmployeeAttendance;

@Repository

public interface EmployeeAttendanceRepository extends JpaRepository<EmployeeAttendance, String>
{
    //User findByUniqueId(String uniqueId);
    //Employee findByUserId(String userId);
}

