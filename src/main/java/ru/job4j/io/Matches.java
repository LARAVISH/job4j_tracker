package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        int number;
        boolean user = true;
        while (count > 0) {
            System.out.println("Возьмите спички от 1 до 3");
            number = Integer.parseInt(input.next());
            user = !user;
            switch (number) {
                case 1, 2, 3 -> {
                    count -= number;
                    System.out.println("Спичек осталось на столе " + count);
                }
                default -> System.out.println("Вы взяли неверное количество спичек");
            }
        }

        if (user) {
            System.out.println("Первый игрок выйграл");
        } else {
            System.out.println("Второй игрок выйграл");
        }
    }
}