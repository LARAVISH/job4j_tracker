package ru.job4j.poly;

public class Test {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle bus1 = new Bus();
        Vehicle train = new Train();
        Vehicle train1 = new Train();
        Vehicle plane = new Plane();
        Vehicle plane1 = new Plane();
        Vehicle[] array = {bus, bus1, train, train1, plane, plane1};

        for (Vehicle i : array) {
                i.move();
                i.speed();
        }
    }
}