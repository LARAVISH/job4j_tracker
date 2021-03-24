package ru.job4j.tracker;

import java.util.List;

public class ShowAction implements UserAction {
    private final OutPut out;

    public ShowAction(OutPut out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Show all Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> resultList = tracker.findAll();
        if (resultList.size() == 0) {
            out.println("Not found");
        } else {
            for (Item show : resultList) {
                out.println(show);
            }
        }
        return true;
    }
}
