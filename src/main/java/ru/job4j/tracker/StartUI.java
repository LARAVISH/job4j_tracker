package ru.job4j.tracker;


public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        Item item1 = new Item();
        Item item2 = new Item();
        item.setName("name1");
        item1.setName("name2");
        item2.setName("");

        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        Item res = tracker.findById(2);
        System.out.println(res.getName());
    }
}
