package ru.job4j.tracker;


import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 0:
                    System.out.println("=== Create a new Item ===");
                    System.out.print("Enter name :");
                    String name = scanner.nextLine();
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
                    System.out.print("Enter id :");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("=== Enter name ===");
                    String name1 = scanner.nextLine();
                    tracker.replace(id, new Item(name1));
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
                    System.out.print("Enter id:");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    tracker.delete(id1);
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
                    System.out.println("Enter id: ");
                    int id2 = Integer.parseInt(scanner.nextLine());
                    tracker.findById(id2);
                    if (tracker.findById(id2) != null) {
                        System.out.println(id2);
                    } else {
                        System.out.println("id not found");
                    }
                case 5:
                    System.out.println("===Find items by name===");
                    System.out.println("Enter name: ");
                    String name2 = scanner.nextLine();
                    Item[] item = tracker.findByName(new Item(name2));
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

}