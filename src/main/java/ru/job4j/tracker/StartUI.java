package ru.job4j.tracker;

public class StartUI  {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            switch (select) {
                case 0:
                    System.out.println("=== Create a new Item ===");
                    String name = input.askStr("Enter name :");
                    tracker.add(new Item(name));
                    break;
                case 1:
                    System.out.println("=== Show all items ===");
                    Item[] items = tracker.findAll();
                    for (Item i : items) {
                        System.out.println(i);
                    }
                    break;
                case 2:
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
                    break;
                case 3:
                    System.out.println("=== Delete item===");
                    int id1 = Integer.parseInt(input.askStr("Enter id:"));
                    if (tracker.delete(id1)) {
                        System.out.println("===Success===");
                    } else {
                        System.out.println("Id number not found");
                        System.out.println("Error when delete an element");
                        System.out.println("Try again");
                    }
                    break;
                case 4:
                    System.out.println("===Find item by Id===");
                    int id2 = Integer.parseInt(input.askStr("Enter id: "));
                    Item res = tracker.findById(id2);
                    if (res != null) {
                        System.out.println(res.getName() + " " + res.getId());
                    } else {
                        System.out.println("id not found");
                    }
                case 5:
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
                case 6:
                    System.out.println("Exit");
                    break;
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