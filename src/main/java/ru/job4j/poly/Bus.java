package ru.job4j.poly;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Автобус передвигается по дороге");
    }

    @Override
    public void speed() {
        System.out.println("Автобус едет со скоростью 80 км/ч");
    }
}
