package com.app_store.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired 
    private ProductService productService;

    // 1. GET /products
    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
    
    // 2. GET /products/
    @GetMapping("/{id}")
    public Product  getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    // 3. GET /products/color/blue   (or use query param version below)
    @GetMapping("/color/{color}")
    public List<Product> getProductsByColor(@PathVariable String color) {
        return productService.getProductsByColor(color);
    }

}