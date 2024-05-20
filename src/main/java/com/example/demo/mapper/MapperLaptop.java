package com.example.demo.mapper;

import com.example.demo.entities.Laptop;
import com.example.demo.entities.LaptopDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperLaptop {
    LaptopDTO matToDTO(Laptop laptop);
    List<LaptopDTO> mapToDTOList(List<Laptop> laptops);
    Laptop mapToEntity(LaptopDTO laptopDTO);
    List<Laptop> mapToEntityList(List<LaptopDTO> laptopDTOS);
}
