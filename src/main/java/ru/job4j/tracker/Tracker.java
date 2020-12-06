package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;

        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] res = new Item[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item != null) {
                res[index] = item;
                index++;
            }
        }
        res = Arrays.copyOf(res, size);

        for (Item i : res) {
            System.out.println(i.getName());
        }
        return res;
    }

    public Item[] findByName(String key) {
        Item[] res = new Item[size];
        int index = 0;
        for (Item i : items) {
            if (i.getName().equals(key)) {
                res[index] = i;
                index++;
            }
        }
        res = Arrays.copyOf(res, size);
        for (Item i : res) {
            System.out.println(i.getName());
        }
        return res;
    }
}