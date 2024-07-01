package com.example.demo.services.imp;


import com.example.demo.entities.Phone;
import com.example.demo.entities.PhoneDTO;
import com.example.demo.entities.User;
import com.example.demo.entities.filter.Filter;
import com.example.demo.mapper.MapperPhones;
import com.example.demo.repositories.RepositoryPhone;
import com.example.demo.repositories.RepositoryUser;
import com.example.demo.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class PhoneServiceImp implements PhoneService {
    @Autowired
    private RepositoryPhone phones;
    @Autowired
    private MapperPhones mapper;
    @Autowired
    private RepositoryUser users;
    @Override
    public List<PhoneDTO> getAllPhones(Filter filter) {
         Page<Phone> phones1=phones.findAll(PageRequest.of(filter.getLimit(), filter.getOffset()));
         List<PhoneDTO> list =new ArrayList<>();
         for(Phone phone:phones1){
             list.add(mapper.mapToDTO(phone));
         }
         return list;
         //return mapper.mapToDTOList(phones.findAll());

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
    public String addToBag(User user , Long id){
        Phone phone=phones.findById(id).orElseThrow();
        if(phone!=null && user !=null) {
            user.addPhone(phone);
            users.save(user);
            return "Successfully added to bag";
        }
        return "Something went wrong";
    }
}
