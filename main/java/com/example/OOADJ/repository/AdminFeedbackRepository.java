package com.example.OOADJ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.OOADJ.model.AdminFeedback;
@Repository
public interface AdminFeedbackRepository extends JpaRepository<AdminFeedback, Integer>
{


}
