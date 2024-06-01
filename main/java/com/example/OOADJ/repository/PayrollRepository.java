package com.example.OOADJ.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.OOADJ.model.Payroll;
import com.example.OOADJ.model.PayrollId;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll, PayrollId> {

    Payroll findByUserId(String userId);

    List<Payroll> findByUserIdOrderByPayDay(String userId);

    List<Payroll> findByUserIdAndPayDay(String userId, String payDay);

    List<Payroll> findByUsername(String username);

}

