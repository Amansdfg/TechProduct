package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="photos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
