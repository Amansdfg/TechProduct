package com.example.demo.services;

import com.example.demo.entities.Phone;
import com.example.demo.entities.PhoneDTO;
import com.example.demo.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    String signUp(User user,String retypeUser);
    String updateUser(User user);
    void deleteUserById(Long id);
    User getUserByEmail(String email);
    String changePassword(Long id ,String oldPassword,String newPassword);
    List<PhoneDTO> getPhones(Long id);
}
