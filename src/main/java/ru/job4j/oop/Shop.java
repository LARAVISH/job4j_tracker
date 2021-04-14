package ru.job4j.oop;

public class Shop {
    public static void main(String[] args) {
        Product product = of();
        System.out.println(product.label());
    }

    private static Product of() {
        return new Product("Oil", 100);
    }
}
