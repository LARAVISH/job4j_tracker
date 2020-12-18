package ru.job4j.tracker;

public class FindItemsByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findByName(input.askStr("Enter name: "));
        if (item.length > 0) {
            for (Item i : item) {
                System.out.println(i);
            }
        } else {
            System.out.println("Items with name not found");
        }
        return true;
    }
}
