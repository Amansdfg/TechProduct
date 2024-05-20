package com.example.demo.services.imp;


import com.example.demo.entities.Phone;
import com.example.demo.entities.PhoneDTO;
import com.example.demo.mapper.MapperPhones;
import com.example.demo.repositories.RepositoryPhone;
import com.example.demo.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PhoneServiceImp implements PhoneService {
    @Autowired
    private RepositoryPhone phones;
    @Autowired
    private MapperPhones mapper;
    @Override
    public List<PhoneDTO> getAllPhones() {
        return mapper.mapToDTOList(phones.findAll());
    }
    @Override
    public PhoneDTO updatePhones(Phone phoneDTO) {
        return mapper.mapToDTO(phones.save(phoneDTO));
    }
    @Override
    public PhoneDTO addPhone(Phone phoneDTO) {
        return mapper.mapToDTO(phones.save(phoneDTO));
    }
    @Override
    public void removePhone(Long id) {
        phones.deleteById(id);
    }

    @Override
    public List<PhoneDTO> searchByName(String name) {
        return mapper.mapToDTOList(phones.findAllByNameContainingIgnoreCase(name));
    }

    @Override
    public PhoneDTO getPhoneById(Long id) {
        return mapper.mapToDTO(phones.findById(id).orElse(null));
    }
}
