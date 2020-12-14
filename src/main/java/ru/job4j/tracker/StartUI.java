package ru.job4j.tracker;

public class StartUI  {
    public static void createItem(Input input, Tracker tracker){
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name :");
        tracker.add(new Item(name));
    }
    public static void  showAllItems(Tracker tracker){
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        for (Item i : items) {
            System.out.println(i);
        }
    }
    public static void editItem(Input input,Tracker tracker){
        System.out.println("=== Edit item ===");
        int id = Integer.parseInt(input.askStr("Enter id :"));
        String name1 = input.askStr("=== Enter name ===");
        if (tracker.replace(id, new Item(name1))) {
            System.out.println("===Success===");
        } else {
            System.out.println("Id number not found");
            System.out.println("Error when replacing an element");
            System.out.println("Try again");
        }
    }
    public static void deleteItem(Input input,Tracker tracker){
        System.out.println("=== Delete item===");
        int id1 = Integer.parseInt(input.askStr("Enter id:"));
        if (tracker.delete(id1)) {
            System.out.println("===Success===");
        } else {
            System.out.println("Id number not found");
            System.out.println("Error when delete an element");
            System.out.println("Try again");
        }
    }
    public static void findItemById(Input input, Tracker tracker){
        System.out.println("===Find item by Id===");
        int id2 = Integer.parseInt(input.askStr("Enter id: "));
        Item res = tracker.findById(id2);
        if (res != null) {
            System.out.println(res.getName() + " " + res.getId());
        } else {
            System.out.println("id not found");
        }
    }
    public static void findItemsByName(Input input, Tracker tracker){
        System.out.println("===Find items by name===");
        String name2 = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name2);
        if (item.length > 0) {
            for (Item i : item) {
                System.out.println(i);
            }
        } else {
            System.out.println("Items with name not found");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            switch (select) {
                case 0 -> StartUI.createItem(input, tracker);
                case 1 -> StartUI.showAllItems(tracker);
                case 2 -> StartUI.editItem(input, tracker);
                case 3 -> StartUI.deleteItem(input, tracker);
                case 4 -> StartUI.findItemById(input, tracker);
                case 5 -> StartUI.findItemsByName(input, tracker);
                case 6 -> {
                    System.out.println("Exit");
                    run = false;
                }
            }
        }
    }

    private void showMenu() {

        System.out.println("MENU.");
        System.out.println("0.Create a new Item");
        System.out.println("1.Show all items");
        System.out.println("2.Edit item");
        System.out.println("3.Delete item");
        System.out.println("4.Find item by Id");
        System.out.println("5.Поиск предметов по названию");
        System.out.println("6.Выход Из Программы");


    }

    public static void main(String[] args) {

        Tracker tracker = new Tracker();
        Input input = new ConsoleInput();
        new StartUI().init(input, tracker);
    }

}