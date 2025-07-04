package src.models.shipping;

import src.models.cart.Cart;
import src.models.cart.CartItem;
import src.interfaces.Shippable;
import src.models.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Shipping {
    private Cart cart;

    public Shipping(Cart cart) {
        this.cart = cart;
    }

    public void processShipping() {
        List<Shippable> shippableItems = new ArrayList<>();
        double totalWeight = 0;

        for (CartItem item : cart.getItems()) {
            Product product = item.getProduct();
            if (product instanceof Shippable) {
                for (int i = 0; i < item.getQuantity(); i++) {
                    Shippable s = (Shippable) product;
                    shippableItems.add(s);
                    totalWeight += s.getWeight();
                }
            }
        }

        if (shippableItems.isEmpty()) {
            System.out.println("🚫 No items require shipping.");
            return;
        }

        System.out.println("\n📦 ** Shipment notice **");
        for (Shippable item : shippableItems) {
            System.out.println("- " + item.getName() + " " + item.getWeight() + "kg");
        }
        System.out.printf("Total package weight: %.2f kg\n", totalWeight);
    }
}
