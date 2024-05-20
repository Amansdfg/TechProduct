package com.example.demo.services;

import com.example.demo.entities.Laptop;
import com.example.demo.entities.LaptopDTO;
import org.springframework.stereotype.Service;

import java.util.List;
public interface LaptopService {
    List<LaptopDTO> getAllLaptops();
    LaptopDTO updateLaptop(LaptopDTO laptop);
    LaptopDTO addLaptop(LaptopDTO laptop);
    void removeLaptop(Long id);
    List<LaptopDTO> searchByName(String name);
    LaptopDTO getLaptopById(Long id);
}
