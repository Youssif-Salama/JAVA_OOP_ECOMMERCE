package src.models;

public class Product {
    protected int id;
    protected String name;
    protected double price;
    protected int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void reduceQuantity(int quantity) {
        if (quantity > this.quantity) throw new IllegalArgumentException("Not enough stock");
        this.quantity -= quantity;
    }
}
