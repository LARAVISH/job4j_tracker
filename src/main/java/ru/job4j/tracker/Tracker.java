package ru.job4j.tracker;

import java.util.Arrays;

public final class Tracker {
    private static  Tracker instance = null;
    private final Item[] items = new Item[100];
    private static int ids = 1;
    private static int size = 0;

    private Tracker(){

    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

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

        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] res = new Item[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                res[index] = item;
                index++;
            }
        }
        return Arrays.copyOf(res, index);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);

        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            int start = index + 1;
            int length = size - index;
            System.arraycopy(items, start, items, index, length);
            items[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }
}