package src.models.cart;

import src.models.product.Product;

public class CartItem {
    private Product product;
    private int quantity;
    private Cart cart;

    public CartItem(Product product, int quantity, Cart cart) {
        this.product = product;
        this.quantity = quantity;
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public Cart getCart() {
        return cart;
    }
}
