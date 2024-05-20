package com.example.demo.mapper;

import com.example.demo.entities.Seller;
import com.example.demo.entities.SellerDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperSeller {
    SellerDTO mapToDTO(Seller seller);
    List<SellerDTO> mapToDTOList(List<Seller> sellers);
    Seller mapToEntity(SellerDTO sellerDTO);
    List<Seller> mapToEntityList(List<SellerDTO> sellerDTOS);
}
