package com.example.demo.entities;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PhoneDTO {
    private Long id;
    private String name;
    private String color;
    private BigInteger price;
    private List<Company> company;
    private boolean available;
    private int stockQuantity;
    private String description;
    private double weight;
    private String screenSize;
    private String resolution;
    private String processor;
    private int ramSizeGB;
    private int storageSizeGB;
    private boolean touchscreen;
    private boolean wifiEnabled;
    private boolean bluetoothEnabled;
    private boolean nfcEnabled;
    private String operatingSystem;
    private double battery;
    private List<Seller> sellers;
}
