package ru.job4j.tracker;

public class FindItemBeIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id: "));
        Item res = tracker.findById(id);
        if (res != null) {
            System.out.println(res);
        } else {
            System.out.println("id not found");
        }
        return true;
    }
}
