package com.spring.security.demo.services;

import com.spring.security.demo.dtos.UserDTO;
import com.spring.security.demo.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);
}
