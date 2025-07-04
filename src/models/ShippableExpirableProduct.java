package src.models;

import java.time.LocalDate;
import src.interfaces.Shippable;

public class ShippableExpirableProduct extends ExpirableProduct implements Shippable {
    private double weight;

    public ShippableExpirableProduct(int id, String name, double price, int quantity,
            LocalDate expiryDate, double weight) {
        super(id, name, price, quantity, expiryDate);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
