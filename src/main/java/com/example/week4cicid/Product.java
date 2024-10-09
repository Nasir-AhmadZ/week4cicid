package com.example.week4cicid;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
    @NotBlank (message ="Name cannot be blank")
    private String name;

    @Min(value=0, message="must be greater or equal to 1")
    private int id;
}
