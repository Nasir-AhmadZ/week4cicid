package com.example.week4cicid;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    List<Product> productList = new ArrayList<>();

    @GetMapping("/getProducts")
    public String getProducts(){
        return "";
    }

    @PostMapping("/addProducts")
    public List<Product> addProduct(@RequestBody Product product)
    {
        productList.add(product);
        return productList;
    }


}
