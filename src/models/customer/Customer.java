package src.models.customer;

public class Customer {
    private int id;
    private String name;
    private double balance;

    public Customer(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getBalance() { return balance; }

    public void addBalance(double amount) { balance += amount; }
    public void reduceBalance(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Not enough balance");
        balance -= amount;
    }
}
