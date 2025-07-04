package src.models;

import java.time.LocalDate;

public class ExpirableProduct extends Product {
    private boolean isExpirable;
    private LocalDate expiryDate;

    public ExpirableProduct(int id, String name, double price, int quantity, boolean isExpirable) {
        super(id, name, price, quantity);
        this.isExpirable = isExpirable;
    }

    public LocalDate getExpirationDate() {
        return expiryDate;
    }

    public boolean isExpirable() {
        return isExpirable;
    }
}
