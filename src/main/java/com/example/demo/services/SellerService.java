package com.example.demo.services;

import com.example.demo.entities.Seller;
import com.example.demo.entities.SellerDTO;

import java.util.List;

public interface SellerService {
    List<SellerDTO> getAllSellers();
    SellerDTO getSellerById(Long id);
    SellerDTO addSeller(Seller seller);
    SellerDTO updateSeller(Seller seller);
    void deleteSellerById(Long id);

}
