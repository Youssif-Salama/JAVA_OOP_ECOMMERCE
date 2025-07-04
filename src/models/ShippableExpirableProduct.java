package src.models;

import java.time.LocalDate;

public class ShippableExpirableProduct {
    private boolean isExpirable;
    private LocalDate expiryDate;
    private boolean isShippable;
    private double weight;

    public ShippableExpirableProduct(boolean isExpirable, LocalDate expiryDate, boolean isShippable, double weight) {
        this.isExpirable = isExpirable;
        this.expiryDate = expiryDate;
        this.isShippable = isShippable;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isShippable() {
        return isShippable;
    }

    public boolean isExpirable() {
        return isExpirable;
    }

    public LocalDate getExpirationDate() {
        return expiryDate;
    }
}
