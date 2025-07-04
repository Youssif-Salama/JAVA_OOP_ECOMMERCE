package src.services;

import java.time.LocalDate;

import src.models.product.ExpirableProduct;
import src.models.product.Product;
import src.models.product.ShippableExpirableProduct;
import src.models.product.ShippableProduct;

public class AddProductsService {
    Product p = new Product(null, 0, 0);
    ShippableProduct sp = new ShippableProduct(null, 0, 0, 0);
    ExpirableProduct ep = new ExpirableProduct(null, 0, 0, null);
    ShippableExpirableProduct sep = new ShippableExpirableProduct(null, 0, 0, null, 0);

    public void addShippableExpirableProduct() {
    }

    public void addExpirableProduct() {
    }

    public void addShippableProduct() {
    }

    public void addProduct() {

    }

}