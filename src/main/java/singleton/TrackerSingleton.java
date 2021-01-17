package singleton;

import ru.job4j.tracker.Item;

public class TrackerSingleton {
    private static TrackerSingleton instance;

    private TrackerSingleton(){
    }

    public static TrackerSingleton getInstance(){
        if(instance == null){
            instance = new TrackerSingleton();
        }
        return instance;
    }

    public static Item add(Item model){
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleton tracker = TrackerSingleton.getInstance();
    }
}
