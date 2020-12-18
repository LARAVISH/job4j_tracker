package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean res = tracker.delete(Integer.parseInt(input.askStr("Enter id:")));
        if (res) {
            System.out.println("===Success===");
        } else {
            System.out.println("Id number not found");
            System.out.println("Error when delete an element");
            System.out.println("Try again");

        }
        return true;
    }
}
