package com.app_store.products;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final List<Product> products = Product.getExampleProducts();

    // 1. GET /products
    @GetMapping
    public List<Product> getProducts() {
        return products.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // 2. GET /products/1
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // 3. GET /products/color/blue   (or use query param version below)
    @GetMapping("/color/{color}")
    public List<Product> getProductsByColor(@PathVariable String color) {
        return products.stream()
                .filter(p -> p.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

}