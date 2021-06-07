package ru.job4j.lambda;

import java.util.function.Predicate;

public class PredicateCheckPositive {

    public static boolean check(int num) {
        return num > 0;
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
