package ru.job4j.poly;

public class Plane implements Vehicle{
    @Override
    public void move() {
        System.out.println("Самолет летит по воздуху");
    }

    @Override
    public void speed() {
        System.out.println("Самолет летит 800 км/ч");
    }
}
