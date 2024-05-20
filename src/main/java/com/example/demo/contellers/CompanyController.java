package com.example.demo.contellers;

import com.example.demo.entities.Company;
import com.example.demo.entities.CompanyDTO;
import com.example.demo.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyService companies;
    @GetMapping
    public List<CompanyDTO> getAllCompanies(){
        return companies.getAllCompanies();
    }
    @GetMapping("{id}")
    public CompanyDTO getCompanyById(@PathVariable("id")Long id){
        return companies.getCompanyById(id);
    }
    @PostMapping
    public CompanyDTO addCompany(@RequestBody Company company){
        return companies.addCompany(company);
    }
    @PutMapping
    public CompanyDTO updateCompany(@RequestBody Company company){
        return companies.updateCompany(company);
    }
}
