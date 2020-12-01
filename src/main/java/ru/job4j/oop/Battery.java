package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(50);
        Battery second = new Battery(20);
        first.exchange(second);
        System.out.println("charge the first battery : " + first.load + ". charge the second  battery : " + second.load);
    }
}
