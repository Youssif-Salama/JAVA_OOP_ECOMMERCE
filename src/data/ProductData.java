package src.data;

import src.models.Product;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductData {
    public static List<Product> getInitialProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Scratch Card", 50, 20));

        return products;
    }
}

