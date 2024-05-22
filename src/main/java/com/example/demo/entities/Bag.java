package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "bag")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
