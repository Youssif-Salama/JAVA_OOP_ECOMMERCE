package src.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import src.models.product.ExpirableProduct;
import src.models.product.Product;
import src.models.product.ShippableExpirableProduct;
import src.models.product.ShippableProduct;

public class ProductsService {
    private List<Product> products = new ArrayList<Product>();

    public void addShippableExpirableProduct(String name, double price, int quantity,
            LocalDate expiryDate, double weight) {
        ShippableExpirableProduct sep = new ShippableExpirableProduct(name, price, quantity, expiryDate, weight);
        products.add(sep);
    }

    public void addExpirableProduct(String name, double price, int quantity, LocalDate expiryDate) {
        ExpirableProduct ep = new ExpirableProduct(name, price, quantity, expiryDate);
        products.add(ep);
    }

    public void addShippableProduct(String name, double price, int quantity, double weight) {
        ShippableProduct sp = new ShippableProduct(name, price, quantity, weight);
        products.add(sp);
    }

    public void addProduct(String name, double price, int quantity) {
        Product p = new Product(null, 0, 0);
        products.add(p);
    }

    public List<Product> getProducts(){
        return products;
    }
}