package ru.job4j.tracker;

import java.util.Objects;

public class FindItemBeIdAction implements UserAction {
    private final OutPut out;

    public FindItemBeIdAction(OutPut out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id: "));
        Item res = tracker.findById(id);
        out.println(Objects.requireNonNullElse(res, "id not found"));
        return true;
    }
}
