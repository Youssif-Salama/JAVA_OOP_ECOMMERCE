package src.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import src.models.product.Product;

public class ProductData {
    public static List<Product> getInitialProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Scratch Card", 50, 20));

        return products;
    }
}

