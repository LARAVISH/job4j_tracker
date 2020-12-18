package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id :"));
        boolean res = tracker.replace(id, new Item(input.askStr("=== Enter name ===")));
        if (res) {
            System.out.println("===Success===");
        } else {
            System.out.println("Id number not found");
            System.out.println("Error when replacing an element");
            System.out.println("Try again");
        }
        return true;
    }
}
