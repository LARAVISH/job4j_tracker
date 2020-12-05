package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            Product prod = products[i];
            if (prod == null) {
                index = i;
                break;
            }
        }
        return index;
    }
}
