package com.example.demo.entities.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Filter {
    private Integer limit;
    private Integer offset;
}
