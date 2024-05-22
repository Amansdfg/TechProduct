package com.example.demo.services;

import com.example.demo.entities.Phone;
import com.example.demo.entities.PhoneDTO;
import com.example.demo.entities.User;

import java.util.List;

public interface PhoneService {
    List<PhoneDTO> getAllPhones();
    PhoneDTO updatePhones(Phone phone);
    PhoneDTO addPhone(Phone phone);
    void removePhone(Long id);
    List<PhoneDTO> searchByName(String name);
    PhoneDTO getPhoneById(Long id);
     String addToBag(User user , Long id);
}
