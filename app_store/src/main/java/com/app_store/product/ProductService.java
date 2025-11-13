package com.app_store.product;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class ProductService{
    private final List<Product> products = new ArrayList<>();

    public ProductService(){
        products.add(new Product(1, "Laptop", 999.99, "15 inch", "Silver"));
        products.add(new Product(2, "Smartphone", 599.99, "6 inch", "Black"));
        products.add(new Product(3, "Headphones", 199.99, "One Size", "Blue"));
        products.add(new Product(4, "Smartwatch", 149.99, "One Size", "Black"));
        products.add(new Product(5, "Tablet", 349.99, "10 inch", "White"));
    }

    public List<Product> getAllProducts(){
        return new ArrayList<>(products);
    }

    // just Product because this is only one product with id
    public Product getProductById(int id){
        return products.stream().filter(p->p.getId()==id).findFirst().orElse(null);
    }

    // get products by color
    public List<Product> getProductsByColor(String color){
        return products.stream()
                .filter(p -> p.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

}
