package com.example.demo.repositories;

import com.example.demo.entities.Approval;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryApproval extends JpaRepository<Approval,Long> {
    Approval findAllByStatus(String status);
}
