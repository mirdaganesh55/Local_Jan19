package com.java.pack1;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private int itemCount = 0;
    private Product[] items;

    public ShoppingCart(int capacity) {
        items = new Product[capacity];
    }

    public void addItem(Product product) {
        if (itemCount < items.length) {
            items[itemCount++] = product;
        } else {
            System.out.println("Shopping cart is full");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            if (item != null) {
                total += item.getPrice();
            }
        }
        return total;
    }
}

public class Shopping {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 999.99);
        Product headphones = new Product("Headphones", 49.99);

        ShoppingCart cart = new ShoppingCart(5);
        cart.addItem(laptop);
        cart.addItem(headphones);

        System.out.println("Total: $" + cart.calculateTotal());
    }
}

