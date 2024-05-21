package com.example.demo.mapper;

import com.example.demo.DTOEntity.DTO;
import com.example.demo.entities.Company;
import com.example.demo.entities.CompanyDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperCompany {
    CompanyDTO mapToDTO(Company company);
    List<CompanyDTO> mapToDTOList(List<Company> companies);
//    Company mapToEntity(CompanyDTO companyDTO);
//    List<Company> mapToEntityList(List<CompanyDTO> companyDTOS);
}
