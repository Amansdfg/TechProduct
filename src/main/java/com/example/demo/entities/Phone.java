package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "phones")
@Setter
@Getter
public class Phone implements Device{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String color;
    private BigInteger price;
    @ManyToMany(fetch = FetchType.EAGER)
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
    private File photoFile;
    private Date date;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Seller> sellers;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Photo> photos;
}
