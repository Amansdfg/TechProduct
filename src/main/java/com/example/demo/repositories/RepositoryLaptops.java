package com.example.demo.repositories;

import com.example.demo.entities.Laptop;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryLaptops extends JpaRepository<Laptop,Long> {
    List<Laptop> findAllByNameContainingIgnoreCase(String name);
}
