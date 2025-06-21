package com.example.productCustomizer.product;

public class ProductFactory {

    public static Product createProduct(String type) {
        switch (type.toLowerCase()){
            case "laptop":
                return new Laptop();
            case "phone":
                return new Phone();
            case "tablet" :
                return new Tablet();
            default:
                throw new IllegalArgumentException("Unknown product type: " + type);
        }
    }
}
