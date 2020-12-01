package ru.job4j.condition;

public class Max {
    public double max(double first, double second) {
        return first > second ? first : second;
    }

    public double max(double first, double second, double third) {
        return max(first,second) > third ? max(first,second) : third;
    }

    public double max(double first, double second, double third, double fourth) {
        return max(first,second,third) > fourth ? max(first,second,third) : fourth;
    }

    public static void main(String[] args) {
        Max maximum = new Max();
        System.out.println(maximum.max(200, 500, 8000, 100));
    }
}
