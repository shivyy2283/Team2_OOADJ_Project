package com.example.OOADJ.service;

import com.example.OOADJ.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.OOADJ.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user)
    {
        return userRepository.save(user);
    }

    @Override
    public User getUserByUserId(Long userId)
    {
        return userRepository.findByUserId(userId);
    }

    @Override
    public User getUniqueId(String uniqueId)
    {
        return userRepository.findByUniqueId(uniqueId);
    }

    @Override
    public boolean loginUser(Long userId, String password) {
        User user = userRepository.findByUserId(userId);
        if (user != null && user.getPassword().equals(password)) {
            return true; // Login successful
        }
        return false; // Login failed
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
