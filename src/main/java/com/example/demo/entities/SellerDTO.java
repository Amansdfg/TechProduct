package com.example.demo.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SellerDTO {
    private Long id;
    private String companyName;
    private String address;
}
