package ru.job4j.poly;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println("Поезд  передвигается по рельсам");
    }

    @Override
    public void speed() {
        System.out.println("Поезд едет со скоростью 300 км/ч");
    }
}
