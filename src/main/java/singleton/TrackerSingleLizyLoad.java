package singleton;

import ru.job4j.tracker.Item;

public class TrackerSingleLizyLoad {

    private TrackerSingleLizyLoad() {

    }

    public static TrackerSingleLizyLoad getInstance() {
        return Holder.INSTANCE;
    }

    public static Item add(Item model) {
        return model;
    }

    public static class Holder {
        private static final TrackerSingleLizyLoad INSTANCE = new TrackerSingleLizyLoad();
    }

    public static void main(String[] args) {
        TrackerSingleLizyLoad tracker = TrackerSingleLizyLoad.getInstance();
    }
}
