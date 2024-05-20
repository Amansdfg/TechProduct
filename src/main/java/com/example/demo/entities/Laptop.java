package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "laptops")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Laptop implements Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String color;
    private BigInteger price;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Company> company;
    private String processor;
    private Integer ramSizeGB;
    private Integer storageSizeGB;
    private String screenSize;
    private String resolution;
    private Boolean touchscreen;
    private String operatingSystem;
    private Double weight;
    private Integer batteryCapacityWh;
    private Boolean wifiEnabled;
    private Boolean bluetoothEnabled;
    private Boolean nfcEnabled;
    private Boolean webcam;
    private Boolean backlitKeyboard;
    private Integer usbPorts;
    private Integer hdmiPorts;
    private Integer ethernetPorts;
    private Boolean sdCardReader;
    private Boolean headphoneJack;
    private Boolean microphone;
    private String warrantyInfo;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Seller> sellers;
}
