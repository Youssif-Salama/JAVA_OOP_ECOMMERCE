package src.models.customer;

public class Customer {
    private int id;
    private String name;
    private double balance;

    public Customer(String name, double balance, int id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    public Customer(String name, double balance) {
        this.balance = balance;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getBalance() { return balance; }

    public void addBalance(double amount) { balance += amount; }
    public void reduceBalance(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Not enough balance");
        balance -= amount;
    }
}
