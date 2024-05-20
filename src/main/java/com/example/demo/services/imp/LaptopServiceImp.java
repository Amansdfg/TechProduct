package com.example.demo.services.imp;

import com.example.demo.entities.Laptop;
import com.example.demo.entities.LaptopDTO;
import com.example.demo.mapper.MapperLaptop;
import com.example.demo.repositories.RepositoryLaptops;
import com.example.demo.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LaptopServiceImp implements LaptopService {
    @Autowired
    private RepositoryLaptops laptops;
    @Autowired
    private MapperLaptop mapper;
    @Override
    public List<LaptopDTO> getAllLaptops() {
        return mapper.mapToDTOList(laptops.findAll());
    }

    @Override
    public LaptopDTO updateLaptop(LaptopDTO laptopDTo) {
        Laptop laptop=mapper.mapToEntity(laptopDTo);
        return mapper.matToDTO(laptops.save(laptop));
    }

    @Override
    public LaptopDTO addLaptop(LaptopDTO laptopDTO) {
        Laptop laptop=mapper.mapToEntity(laptopDTO);

        return mapper.matToDTO(laptops.save(laptop));
    }

    @Override
    public void removeLaptop(Long id) {
        laptops.deleteById(id);
    }

    @Override
    public List<LaptopDTO> searchByName(String name) {
        return mapper.mapToDTOList(laptops.findAllByNameContainingIgnoreCase(name));
    }

    @Override
    public LaptopDTO getLaptopById(Long id) {
        return mapper.matToDTO(laptops.findById(id).orElse(null));
    }
}
