package com.example.inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {
    private Map<String, Product> inventory = new HashMap<>();

    public void addProduct(String id, String name, int quantity, double price) {
        Product product = new Product(id, name, quantity, price);
        inventory.put(id, product);
    }

    public Product getProduct(String id) {
        return inventory.get(id);
    }

    public void updateProductQuantity(String id, int quantity) {
        Product product = inventory.get(id);
        if (product != null) {
            product.setQuantity(quantity);
        }
    }

    public void updateProductPrice(String id, double price) {
        Product product = inventory.get(id);
        if (product != null) {
            product.setPrice(price);
        }
    }

    public void removeProduct(String id) {
        inventory.remove(id);
    }

    public void listAllProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
