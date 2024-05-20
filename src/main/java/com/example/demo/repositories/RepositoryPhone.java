package com.example.demo.repositories;


import com.example.demo.entities.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RepositoryPhone extends JpaRepository<Phone,Long> {
    List<Phone> findAllByNameContainingIgnoreCase(String name);
}
