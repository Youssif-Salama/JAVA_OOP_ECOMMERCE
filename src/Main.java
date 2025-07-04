package src;

import src.models.product.Product;
import src.models.product.ShippableExpirableProduct;
import src.models.product.ExpirableProduct;
import src.models.product.ShippableProduct;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product cheese = new ShippableExpirableProduct(
            1,
            "Cheese",
            100.0,
            5,
            LocalDate.of(2025, 7, 15),
            0.4
        );

        Product biscuits = new ExpirableProduct(
            2,
            "Biscuits",
            150.0,
            10,
            LocalDate.of(2025, 8, 1)
        );

        Product tv = new ShippableProduct(
            3,
            "TV",
            500.0,
            3,
            5.0
        );

        Product scratchCard = new Product(
            4,
            "Scratch Card",
            50.0,
            100
        );

        // Just print to confirm:
        System.out.println("Products initialized successfully ✅");
    }
}
