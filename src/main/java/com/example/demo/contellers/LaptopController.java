package com.example.demo.contellers;
import com.example.demo.entities.Laptop;
import com.example.demo.entities.LaptopDTO;
import com.example.demo.entities.Phone;
import com.example.demo.services.PhoneService;
import com.example.demo.services.imp.LaptopServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/laptops")
public class LaptopController {
    @Autowired
    private LaptopServiceImp laptops;
    @GetMapping
    public List<LaptopDTO> getAllLaptops(){
        return laptops.getAllLaptops();
    }
    @PostMapping
    public LaptopDTO addLaptop(@RequestBody LaptopDTO laptop){
        return laptops.addLaptop(laptop);
    }
    @PutMapping
    public LaptopDTO updateLaptop(@RequestBody LaptopDTO laptop){
        return laptops.updateLaptop(laptop);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id")Long id){
        laptops.removeLaptop(id);
    }
    @GetMapping(value = "/search")
    public List<LaptopDTO> searchLaptop(@RequestParam("name") String  name){
        return laptops.searchByName(name);
    }
}
