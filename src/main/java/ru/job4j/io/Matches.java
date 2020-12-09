package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 11;
        int number;
        while (count > 0) {
            System.out.println("Первый игрок берет спички");
            number = Integer.parseInt(input.next());
            if (number >= 1 && number <= 3) {
                count -= number;
                System.out.println("На столе осталось спичек : " + count);
                if (count == 0) {
                    System.out.println("Первый игрок победил");
                    break;
                }
            } else {
                System.out.println("Вы взяли неправильное колличество спичек");
                System.out.println("Возьмите верное количество спичек от 1 до 3");
                number = Integer.parseInt(input.next());
                if (number >= 1 && number <= 3) {
                    count -= number;
                    System.out.println("На столе осталось спичек : " + count);
                }
            }
            System.out.println("Второй игрок берет спички");
           number = Integer.parseInt(input.next());
            if (number >= 1 && number <= 3) {
                count -= number;
                System.out.println("На столе осталось спичек : " + count);
                if (count == 0) {
                    System.out.println("Второй победил");
                    break;
                }
            } else {
                System.out.println("Вы взяли неправильное колличество спичек");
                System.out.println("Возьмите верное количество спичек от 1 до 3");
                number = Integer.parseInt(input.next());
                if (number >= 1 && number <= 3) {
                    count -= number;
                    System.out.println("На столе осталось спичек : " + count);
                }
            }
        }
        System.out.println("The End");

    }
}