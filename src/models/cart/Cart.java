package src.models.cart;

import src.interfaces.Shippable;
import src.models.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;
    private int customerId;
    private List<CartItem> items;

    public Cart(int id, int customerId) {
        this.id = id;
        this.customerId = customerId;
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        if (quantity > product.getQuantity()) {
            throw new IllegalArgumentException("Quantity exceeds available stock.");
        }

        items.add(new CartItem(product, quantity));
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public double getSubtotal() {
        return items.stream()
                .mapToDouble(CartItem::getTotalPrice)
                .sum();
    }

    public List<CartItem> getItems() {
        return items;
    }

    public List<Shippable> getShippableItems() {
        List<Shippable> shippableList = new ArrayList<>();
        for (CartItem item : items) {
            if (item.getProduct() instanceof Shippable) {
                for (int i = 0; i < item.getQuantity(); i++) {
                    shippableList.add((Shippable) item.getProduct());
                }
            }
        }
        return shippableList;
    }
}
