package com.example.OOADJ.service;

import com.example.OOADJ.model.User;
public interface UserService {
    User registerUser(User user);

    User getUserByUserId(Long userId);

    User getUniqueId(String uniqueId);
    boolean loginUser(Long userId,String password);
    User getUserById(Long userId);
}
