package singleton;

import ru.job4j.tracker.Item;

public class TrackerSingleEagerLoad {
    private static final TrackerSingleEagerLoad INSTANCE = new TrackerSingleEagerLoad();

    private TrackerSingleEagerLoad() {

    }

    public static TrackerSingleEagerLoad getInstance() {
        return INSTANCE;
    }

    public static Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleEagerLoad tracker = TrackerSingleEagerLoad.getInstance();
    }
}
