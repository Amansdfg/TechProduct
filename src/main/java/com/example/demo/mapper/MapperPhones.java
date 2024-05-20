package com.example.demo.mapper;

import com.example.demo.entities.Phone;
import com.example.demo.entities.PhoneDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperPhones {
    PhoneDTO mapToDTO(Phone phone);
    List<PhoneDTO> mapToDTOList(List<Phone> phones);
    Phone mapToEntity(PhoneDTO phoneDTO);
    List<Phone> mapToEntityList(List<PhoneDTO> phoneDTOS);
}
