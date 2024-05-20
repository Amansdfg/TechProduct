package com.example.demo.services.imp;

import com.example.demo.entities.Seller;
import com.example.demo.entities.SellerDTO;
import com.example.demo.mapper.MapperSeller;
import com.example.demo.repositories.RepositorySeller;
import com.example.demo.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SellerServiceImp implements SellerService {
    @Autowired
    private RepositorySeller sellers;
    @Autowired
    private MapperSeller mapper;
    @Override
    public List<SellerDTO> getAllSellers() {
        return mapper.mapToDTOList(sellers.findAll());
    }

    @Override
    public SellerDTO getSellerById(Long id) {
        return mapper.mapToDTO(sellers.findById(id).orElse(null));
    }

    @Override
    public SellerDTO addSeller(Seller seller) {
        return mapper.mapToDTO(sellers.save(seller));
    }

    @Override
    public SellerDTO updateSeller(Seller seller) {
        return mapper.mapToDTO(sellers.save(seller));
    }

    @Override
    public void deleteSellerById(Long id) {
        sellers.deleteById(id);
    }
}