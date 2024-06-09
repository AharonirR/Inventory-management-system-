package com.example.inventory;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();

        // Add products
        inventoryService.addProduct("1", "Product A", 100, 10.5);
        inventoryService.addProduct("2", "Product B", 200, 20.0);

        // List all products
        System.out.println("Listing all products:");
        inventoryService.listAllProducts();

        // Update product quantity
        inventoryService.updateProductQuantity("1", 150);
        System.out.println("\nUpdated Product A quantity:");
        System.out.println(inventoryService.getProduct("1"));

        // Update product price
        inventoryService.updateProductPrice("2", 25.0);
        System.out.println("\nUpdated Product B price:");
        System.out.println(inventoryService.getProduct("2"));

        // Remove a product
        inventoryService.removeProduct("1");
        System.out.println("\nRemoved Product A. Listing all products:");
        inventoryService.listAllProducts();
    }
}
