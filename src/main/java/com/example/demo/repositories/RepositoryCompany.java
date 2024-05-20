package com.example.demo.repositories;

import com.example.demo.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCompany extends JpaRepository<Company,Long>{
}
