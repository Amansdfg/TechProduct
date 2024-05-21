package com.example.demo.services.imp;

import com.example.demo.DTOEntity.DTO;
import com.example.demo.entities.Company;
import com.example.demo.entities.CompanyDTO;
import com.example.demo.mapper.MapperCompany;
import com.example.demo.repositories.RepositoryCompany;
import com.example.demo.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CompanyServiceImp implements CompanyService {
    @Autowired
    RepositoryCompany companies;
    @Autowired
    MapperCompany mapper;
    @Override
    public CompanyDTO getCompanyById(Long id) {
        return mapper.mapToDTO(companies.findById(id).orElse(null));
    }

    @Override
    public List<CompanyDTO> getAllCompanies() {
        return mapper.mapToDTOList(companies.findAll());
    }

    @Override
    public CompanyDTO addCompany(Company company) {
        return mapper.mapToDTO(companies.save(company));
    }

    @Override
    public CompanyDTO updateCompany(Company company) {
        return mapper.mapToDTO(companies.save(company));
    }

    @Override
    public void deleteCompanyById(Long id) {
        companies.deleteById(id);
    }
}
