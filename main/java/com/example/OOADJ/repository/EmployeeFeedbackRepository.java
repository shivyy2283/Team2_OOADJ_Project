package com.example.OOADJ.repository;

import com.example.OOADJ.model.EmployeeFeedback;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EmployeeFeedbackRepository extends JpaRepository<EmployeeFeedback, Integer> {

}