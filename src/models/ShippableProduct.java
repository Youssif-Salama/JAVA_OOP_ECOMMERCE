package src.models;

public class ShippableProduct extends Product {
    private boolean isShippable;
    private double weight;

    public ShippableProduct(int id, String name, double price, int quantity, boolean isShippable) {
        super(id, name, price, quantity);
        this.isShippable = isShippable;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isShippable() {
        return isShippable;
    }
}
