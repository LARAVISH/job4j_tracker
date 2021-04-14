package ru.job4j.condition;

public class Max {
    public double max(double first, double second) {
        return Math.max(first, second);
    }

    public double max(double first, double second, double third) {
        return max(max(first,second),third);
    }

    public double max(double first, double second, double third, double fourth) {
        return max(max(first,second,third),fourth);
    }

    public static void main(String[] args) {
        Max maximum = new Max();
        System.out.println(maximum.max(200, 500, 8000, 100));
    }
}
