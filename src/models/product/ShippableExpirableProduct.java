package src.models.product;

import java.time.LocalDate;
import src.interfaces.Shippable;

public class ShippableExpirableProduct extends ExpirableProduct implements Shippable {
    private double weight;

    public ShippableExpirableProduct( String name, double price, int quantity,
            LocalDate expiryDate, double weight) {
        super( name, price, quantity, expiryDate);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
