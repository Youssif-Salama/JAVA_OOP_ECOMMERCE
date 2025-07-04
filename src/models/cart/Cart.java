package src.models.cart;

import java.util.ArrayList;
import java.util.List;

import src.models.customer.Customer;

public class Cart {
    private int id;
    private Customer customer;
    private List<CartItem> items=new ArrayList<>();

    public Cart(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<CartItem> getItems() {
        return items;
    }


    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public void addItem(CartItem item) {
        this.items.add(item);
    }

    public void removeItem(CartItem item) {
        this.items.remove(item);
    }
}
