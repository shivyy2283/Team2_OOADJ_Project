package com.example.OOADJ.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.OOADJ.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserId(Long userId);
    User findByUniqueId(String uniqueId);
}
