package com.example.OOADJ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.OOADJ.model.Leave;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepository extends JpaRepository<Leave,Long> {
}
