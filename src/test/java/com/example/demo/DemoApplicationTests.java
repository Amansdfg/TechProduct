package com.example.demo;

import com.example.demo.entities.*;
import com.example.demo.mapper.MapperCompany;
import com.example.demo.mapper.MapperSeller;
import com.example.demo.repositories.RepositoryLaptops;
import com.example.demo.services.LaptopService;
import jakarta.persistence.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.text.LayeredHighlighter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private LaptopService laptopService;
	@Autowired
	private RepositoryLaptops repositoryLaptops;
	@Autowired
	MapperCompany mapperCompany;
	@Autowired
	MapperSeller mapperSeller;
	@Test
	void contextLoads() {
	}
	@Test
	void getAllLaptopsTest(){
		List<LaptopDTO> laptops=laptopService.getAllLaptops();
		Assertions.assertNotNull(laptops);
	}
	@Test
	void addingLaptopTest() {
		Company company = new Company();
		company.setId(1L);
		List<Company> companies = new ArrayList<>();
		companies.add(company);
		Seller seller = new Seller();
		seller.setId(1L);
		List<Seller> sellers = new ArrayList<>();
		sellers.add(seller);
		LaptopDTO laptop = new LaptopDTO(null, "Dell XPS 15", "Silver", new BigInteger(1699 + ""), companies, "Intel Core i7", 16, 512, "15.6 inches", "3840x2160 pixels", true, "Windows 11", 4.4, 86, true, true, false, true, true, 3, 1, 1, true, true, true, "2 years", sellers);
		repositoryLaptops.deleteAll();
		laptopService.addLaptop(laptop);
		List<Laptop> laptops = repositoryLaptops.findAll();
		Assertions.assertEquals(laptops.get(0).getName(), laptop.getName());
		Assertions.assertEquals(laptops.get(0).getColor(), laptop.getColor());
		Assertions.assertEquals(laptops.get(0).getPrice(), laptop.getPrice());
		for (int i = 0; i < laptop.getCompany().size(); i++) {
			Assertions.assertEquals(laptops.get(0).getCompany().get(i).getId(), laptop.getCompany().get(i).getId());
		}
		Assertions.assertEquals(laptops.get(0).getProcessor(), laptop.getProcessor());
		Assertions.assertEquals(laptops.get(0).getRamSizeGB(), laptop.getRamSizeGB());
		Assertions.assertEquals(laptops.get(0).getStorageSizeGB(), laptop.getStorageSizeGB());
		Assertions.assertEquals(laptops.get(0).getScreenSize(), laptop.getScreenSize());
		Assertions.assertEquals(laptops.get(0).getResolution(), laptop.getResolution());
		Assertions.assertEquals(laptops.get(0).getTouchscreen(), laptop.getTouchscreen());
		Assertions.assertEquals(laptops.get(0).getOperatingSystem(), laptop.getOperatingSystem());
		Assertions.assertEquals(laptops.get(0).getWeight(), laptop.getWeight());
		Assertions.assertEquals(laptops.get(0).getBatteryCapacityWh(), laptop.getBatteryCapacityWh());
		Assertions.assertEquals(laptops.get(0).getWifiEnabled(), laptop.getWifiEnabled());
		Assertions.assertEquals(laptops.get(0).getBluetoothEnabled(), laptop.getBluetoothEnabled());
		Assertions.assertEquals(laptops.get(0).getNfcEnabled(), laptop.getNfcEnabled());
		Assertions.assertEquals(laptops.get(0).getWebcam(), laptop.getWebcam());
		Assertions.assertEquals(laptops.get(0).getBacklitKeyboard(), laptop.getBacklitKeyboard());
		Assertions.assertEquals(laptops.get(0).getUsbPorts(), laptop.getUsbPorts());
		Assertions.assertEquals(laptops.get(0).getHdmiPorts(), laptop.getHdmiPorts());
		Assertions.assertEquals(laptops.get(0).getEthernetPorts(), laptop.getEthernetPorts());
		Assertions.assertEquals(laptops.get(0).getSdCardReader(), laptop.getSdCardReader());
		Assertions.assertEquals(laptops.get(0).getHeadphoneJack(), laptop.getHeadphoneJack());
		Assertions.assertEquals(laptops.get(0).getWarrantyInfo(), laptop.getWarrantyInfo());
		for (int i = 0; i < laptop.getSellers().size(); i++) {
			Assertions.assertEquals(laptop.getSellers().get(i).getId(), laptops.get(0).getSellers().get(i).getId());
		}
	}
	@Test
	void getLaptopTest(){
		LaptopDTO laptop=laptopService.getLaptopById(2L);
		List<LaptopDTO> laptopDTOS=new ArrayList<>();
		laptopDTOS.add(laptop);
		Assertions.assertNotNull(laptopDTOS);
	}
	@Test
	void deleteLaptopTest(){
		laptopService.removeLaptop(2L);
		Laptop laptop=repositoryLaptops.findById(2L).orElse(null);
		Assertions.assertNull(laptop);
	}
	@Test
	void updateLaptopTest() {
		Company company = new Company();
		company.setId(1L);
		List<Company> companies = new ArrayList<>();
		companies.add(company);
		Seller seller = new Seller();
		seller.setId(1L);
		List<Seller> sellers = new ArrayList<>();
		sellers.add(seller);
		LaptopDTO laptopToUpdate = new LaptopDTO(null, "Updated Laptop", "Black", new BigInteger(1999 + ""), companies, "Intel Core i9", 32, 1024, "17.3 inches", "3840x2160 pixels", true, "Windows 11 Pro", 4.8, 100, true, true, true, true, true, 4, 2, 1, true, true, false, "3 years", sellers);
		repositoryLaptops.deleteAll();
		laptopService.updateLaptop(laptopToUpdate);
		Long laptopId = repositoryLaptops.findAll().get(0).getId();
		laptopToUpdate.setId(laptopId);
		laptopService.updateLaptop(laptopToUpdate);
		Laptop updatedLaptop = repositoryLaptops.findById(laptopId).orElse(null);
		Assertions.assertNotNull(updatedLaptop);
		Assertions.assertEquals(laptopToUpdate.getName(), updatedLaptop.getName());
		Assertions.assertEquals(laptopToUpdate.getColor(), updatedLaptop.getColor());
		Assertions.assertEquals(laptopToUpdate.getPrice(), updatedLaptop.getPrice());
		for (int i = 0; i < laptopToUpdate.getCompany().size(); i++) {
			Assertions.assertEquals(laptopToUpdate.getCompany().get(i).getId(),updatedLaptop.getCompany().get(i).getId());
		}
		Assertions.assertEquals(laptopToUpdate.getProcessor(), updatedLaptop.getProcessor());
		Assertions.assertEquals(laptopToUpdate.getRamSizeGB(), updatedLaptop.getRamSizeGB());
		Assertions.assertEquals(laptopToUpdate.getStorageSizeGB(), updatedLaptop.getStorageSizeGB());
		Assertions.assertEquals(laptopToUpdate.getScreenSize(), updatedLaptop.getScreenSize());
		Assertions.assertEquals(laptopToUpdate.getResolution(), updatedLaptop.getResolution());
		Assertions.assertEquals(laptopToUpdate.getTouchscreen(), updatedLaptop.getTouchscreen());
		Assertions.assertEquals(laptopToUpdate.getOperatingSystem(), updatedLaptop.getOperatingSystem());
		Assertions.assertEquals(laptopToUpdate.getWeight(), updatedLaptop.getWeight());
		Assertions.assertEquals(laptopToUpdate.getBatteryCapacityWh(), updatedLaptop.getBatteryCapacityWh());
		Assertions.assertEquals(laptopToUpdate.getWifiEnabled(), updatedLaptop.getWifiEnabled());
		Assertions.assertEquals(laptopToUpdate.getBluetoothEnabled(), updatedLaptop.getBluetoothEnabled());
		Assertions.assertEquals(laptopToUpdate.getNfcEnabled(), updatedLaptop.getNfcEnabled());
		Assertions.assertEquals(laptopToUpdate.getWebcam(), updatedLaptop.getWebcam());
		Assertions.assertEquals(laptopToUpdate.getBacklitKeyboard(), updatedLaptop.getBacklitKeyboard());
		Assertions.assertEquals(laptopToUpdate.getUsbPorts(), updatedLaptop.getUsbPorts());
		Assertions.assertEquals(laptopToUpdate.getHdmiPorts(), updatedLaptop.getHdmiPorts());
		Assertions.assertEquals(laptopToUpdate.getEthernetPorts(), updatedLaptop.getEthernetPorts());
		Assertions.assertEquals(laptopToUpdate.getSdCardReader(), updatedLaptop.getSdCardReader());
		Assertions.assertEquals(laptopToUpdate.getHeadphoneJack(), updatedLaptop.getHeadphoneJack());
		Assertions.assertEquals(laptopToUpdate.getWarrantyInfo(), updatedLaptop.getWarrantyInfo());
		for (int i = 0; i < laptopToUpdate.getSellers().size(); i++) {
			Assertions.assertEquals(laptopToUpdate.getSellers().get(i).getId(), updatedLaptop.getSellers().get(i).getId());
		}
	}

}