package com.example.productCustomizer.controller;

import com.example.productCustomizer.product.Product;
import com.example.productCustomizer.product.ProductFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Controller {

    @GetMapping("/{type}")
    public String getProductDescription(@PathVariable String type) {
        Product product = ProductFactory.createProduct(type);
        return product.getDescription();
    }
}
