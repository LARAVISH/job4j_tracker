package ru.job4j.tracker;

public class CreateAction implements UserAction {
    private final OutPut out;

    public CreateAction(OutPut out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Create  ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Create a new item  ====");
        String name = input.askStr("Enter name :");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
