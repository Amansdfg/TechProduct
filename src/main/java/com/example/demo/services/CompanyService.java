package com.example.demo.services;

import com.example.demo.DTOEntity.DTO;
import com.example.demo.entities.Company;
import com.example.demo.entities.CompanyDTO;

import java.util.List;

public interface CompanyService {
    CompanyDTO getCompanyById(Long id);
    List<CompanyDTO> getAllCompanies();
    CompanyDTO addCompany(Company company);
    CompanyDTO updateCompany(Company company);
    void deleteCompanyById(Long id);
}
