package com.example.week4cicid;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    List<Person> Person = new ArrayList<>();

    @GetMapping("/getPerson")
    public List<Person> getProducts(){
        return Person;
    }

    @PostMapping("/createPerson")
    public List<Person> addProduct(@Valid @RequestBody Person person)
    {
        Person.add(person);
        return Person;
    }


}
