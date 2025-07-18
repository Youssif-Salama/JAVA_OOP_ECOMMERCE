package src.models.product;

import java.time.LocalDate;
import src.interfaces.Expirable;

public class ExpirableProduct extends Product implements Expirable {
    protected LocalDate expiryDate;

    public ExpirableProduct( String name, double price, int quantity, LocalDate expiryDate) {
        super( name, price, quantity);
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
