package com.example.demo.contellers;

import com.example.demo.entities.Seller;
import com.example.demo.entities.SellerDTO;
import com.example.demo.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/seller")
public class SellerController {
    @Autowired
    private SellerService sellerService;
    @GetMapping
    public List<SellerDTO> getAllSellers(){
        return sellerService.getAllSellers();
    }
    @GetMapping("{id}")
    public SellerDTO getSellerById(@PathVariable("id")Long id){
        return sellerService.getSellerById(id);
    }
    @PostMapping
    public SellerDTO addSeller(@RequestBody Seller seller){
        return sellerService.addSeller(seller);
    }
    @PutMapping
    public SellerDTO updateSeller(@RequestBody Seller seller){
        return sellerService.updateSeller(seller);
    }
    @DeleteMapping("{id}")
    public void deleteSellerById(@PathVariable("id")Long id){
        sellerService.deleteSellerById(id);
    }

}
