package src;

import src.interfaces.Shippable;
import src.models.cart.Cart;
import src.models.cart.CartItem;
import src.models.customer.Customer;
import src.models.product.Product;
import src.services.ProductsService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductsService ps = new ProductsService();

        // Normal products
        ps.addProduct("Scratch Card", 50, 100);
        ps.addProduct("Book", 80, 30);

        // Shippable only
        ps.addShippableProduct("TV", 500, 2, 7.0);
        ps.addShippableProduct("Microwave", 300, 5, 5.5);

        // Expirable only
        ps.addExpirableProduct("Biscuits", 150, 10, LocalDate.of(2025, 8, 1));
        ps.addExpirableProduct("Juice", 25, 20, LocalDate.of(2025, 7, 20));

        // Shippable + Expirable
        ps.addShippableExpirableProduct("Cheese", 100, 5, LocalDate.of(2025, 7, 15), 0.4);
        ps.addShippableExpirableProduct("Milk", 60, 12, LocalDate.of(2025, 7, 18), 1.0);

        System.out.println("✅ Products added: " + ps.getProducts().size());

        // customer auth
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer Data [name, balance]");
        String name = sc.next();
        double balance = sc.nextDouble();
        Customer customer = new Customer(name, balance, 1);
        System.out.println("✅ Welcome, " + customer.getName() + ". Your balance is EGP " + customer.getBalance());

        // make customer cart
        Cart cart = new Cart(customer.getId(), customer);
        System.out.println("✅ Cart created for, " + customer.getName() + ". Your cart is "
                + (cart.isEmpty() ? "empty" : "not empty"));

        // display products
        System.out.println("To display products Y/N");
        String displayProducts = sc.next();
        if (displayProducts.equalsIgnoreCase("N")) {
            System.out.println("thanks!");
            sc.close();
            return;
        } else {
            System.out.println("Products:");
            for (Product product : ps.getProducts()) {
                System.out.println("- " + product.getName() + " | EGP " + product.getPrice() + " | Qty: "
                        + product.getQuantity() + "\n");
            }

            // looper for add products to cart
            boolean loop = false;
            do {
                System.out.println("Write the name and quantity of the product you want to buy!!!");
                String productName = sc.next();
                int productQuantity = sc.nextInt();
                Product product = ps.getProductByName(productName);

                if (product == null) {
                    System.out.println("❌ Product not found");
                } else {
                    try {
                        product.reduceQuantity(productQuantity);
                        CartItem cartItem = new CartItem(product, productQuantity, cart);
                        cart.addItem(cartItem);

                        System.out.println("✅ Item added to cart \n");

                        System.out.println("Cart Items:");
                        for (CartItem item : cart.getItems()) {
                            System.out.println("- " + item.getProduct().getName() +
                                    " | EGP " + item.getProduct().getPrice() +
                                    " | Qty: " + item.getQuantity());
                        }

                        System.out.println("Do you want to add more items? Y/N");
                        String addMore = sc.next();
                        loop = addMore.equalsIgnoreCase("Y");

                    } catch (IllegalArgumentException e) {
                        System.out.println("❌ " + e.getMessage());
                    }
                }

            } while (loop);
            System.out.println("\n📦 Shippable Items Summary:");

            List<Shippable> shippableItems = new ArrayList<>();
            double totalWeight = 0;

            for (CartItem item : cart.getItems()) {
                Product p = item.getProduct();
                if (p instanceof Shippable) {
                    for (int i = 0; i < item.getQuantity(); i++) {
                        shippableItems.add((Shippable) p);
                        totalWeight += ((Shippable) p).getWeight();
                        System.out.println("- " + p.getName() + " " + ((Shippable) p).getWeight() + "kg");
                    }
                }
            }

            if (shippableItems.isEmpty()) {
                System.out.println("🚫 No shippable items in cart.");
            } else {
                System.out.printf("📦 Total package weight: %.2f kg\n", totalWeight);
            }

        }

        sc.close();
    }
}
