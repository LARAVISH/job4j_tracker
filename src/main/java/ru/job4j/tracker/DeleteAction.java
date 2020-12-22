package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final OutPut out;

    public DeleteAction(OutPut out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Delete ";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        boolean res = tracker.delete(Integer.parseInt(input.askStr("Enter id:")));
        if (res) {
            out.println("===Success===");
        } else {
            out.println("Id number not found");
            out.println("Error when delete an element");
            out.println("Try again");

        }
        return true;
    }
}
