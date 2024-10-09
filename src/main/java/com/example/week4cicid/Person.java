package com.example.week4cicid;


import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank (message ="Name cannot be blank")
    private String name;
    @Size(max=13,message ="Title cannot be greater than 13 characters")
    private String title;
    @PositiveOrZero(message = "id cannot be negative")
    private int employedid;
    @Min(value=0, message="age must be greater or equal to 1")
    private int age;
    @Email(message="Invalid Email")
    private String email;
    @Max (value=20,message ="Cannot enter more than 20 characters")
    private String position;
    @NotBlank(message="Cannot enter nothing")
    private String department;

}
