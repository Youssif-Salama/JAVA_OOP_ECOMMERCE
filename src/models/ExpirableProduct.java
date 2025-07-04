package src.models;

import java.time.LocalDate;
import src.interfaces.Expirable;

public class ExpirableProduct extends Product implements Expirable {
    protected LocalDate expiryDate;

    public ExpirableProduct(int id, String name, double price, int quantity, LocalDate expiryDate) {
        super(id, name, price, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }
}
