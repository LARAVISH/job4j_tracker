package ru.job4j.tracker;

public class FindItemsByNameAction implements UserAction {
    private final OutPut out;

    public FindItemsByNameAction(OutPut out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find items by name l===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] item = tracker.findByName(input.askStr("Enter name: ")).toArray(new Item[0]);
        if (item.length > 0) {
            for (Item i : item) {
                out.println(i);
            }
        } else {
            out.println("Items with name not found");
        }
        return true;
    }
}
